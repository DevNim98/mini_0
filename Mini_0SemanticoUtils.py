from antlr4 import *
from Mini_0Parser import Mini_0Parser
from Mini_0SymbolTable import Mini_0SymbolTable


class Mini_0SemanticoUtils:
    def __init__(self):
        self.semanticErrors = []

    def addSemanticError(self, t: Token, message: str):
        line = t.line
        column = t.column
        self.semanticErrors.append(
            "Error semantico [" + str(line) + ":" + str(column) + "] - " + message
        )

    def verifyTypeExpr(
        self, table: Mini_0SymbolTable, ctx: Mini_0Parser.ExprAritmeticaContext
    ):
        ret = None
        for ta in ctx.termAritmetico():
            aux = self.verifyTypeTerm(table, ta)
            if ret == None:
                ret = aux
            elif ret != aux and aux != Mini_0SymbolTable.Mini_0Type.INVALIDO:
                self.addSemanticError(
                    ctx.start,
                    "Expresion " + ctx.getText() + " contiene tipos incompatibles",
                )
                ret = Mini_0SymbolTable.Mini_0Type.INVALIDO
        return ret

    def verifyTypeTerm(
        self, table: Mini_0SymbolTable, ctx: Mini_0Parser.TermAritmeticoContext
    ):
        ret = None
        for fa in ctx.factorAritmetico():
            aux = self.verifyTypeFactor(table, fa)
            if ret == None:
                ret = aux
            elif ret != aux and aux != Mini_0SymbolTable.Mini_0Type.INVALIDO:
                self.addSemanticError(
                    ctx.start,
                    "Expresion " + ctx.getText() + " contiene tipos incompatibles",
                )
                ret = Mini_0SymbolTable.Mini_0Type.INVALIDO
        return ret

    def verifyTypeFactor(
        self, table: Mini_0SymbolTable, ctx: Mini_0Parser.FactorAritmeticoContext
    ):
        if ctx.LITNUMERAL() != None:
            return Mini_0SymbolTable.Mini_0Type.NUMERO
        if ctx.LITSTRING() != None:
            return Mini_0SymbolTable.Mini_0Type.STRING
        if ctx.BOOL() != None:
            return Mini_0SymbolTable.Mini_0Type.BOOL
        if ctx.LITCHAR() != None:
            return Mini_0SymbolTable.Mini_0Type.CHAR
        if ctx.ID() != None:
            varName = ctx.ID().getText()
            if not table.exists(varName):
                self.addSemanticError(
                    ctx.ID().getSymbol(),
                    "Variable " + varName + " no fue declarada antes de uso",
                )
                return Mini_0SymbolTable.Mini_0Type.INVALIDO
            return self.verifyType(table, varName)
        return self.verifyTypeExpr(table, ctx.exprAritmetica())

    def verifyType(self, table: Mini_0SymbolTable, varName: str):
        return table.verify(varName)
