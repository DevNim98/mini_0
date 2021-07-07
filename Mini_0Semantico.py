from Mini_0SemanticoUtils import Mini_0SemanticoUtils
from Mini_0Parser import Mini_0Parser
from Mini_0SymbolTable import Mini_0SymbolTable
from Mini_0Visitor import Mini_0Visitor


class Mini_0Semantico(Mini_0Visitor):
    def __init__(self):
        self.table = Mini_0SymbolTable()
        self.utils = Mini_0SemanticoUtils()

    def visitDeclvar(self, ctx: Mini_0Parser.DeclvarContext):
        varName = ctx.ID().getText()
        varTypeText = ctx.tipo().getText()
        varType = Mini_0SymbolTable.Mini_0Type.INVALIDO
        if varTypeText == "int":
            varType = Mini_0SymbolTable.Mini_0Type.NUMERO
        elif varTypeText == "char":
            varType = Mini_0SymbolTable.Mini_0Type.CHAR
        elif varTypeText == "string":
            varType = Mini_0SymbolTable.Mini_0Type.STRING
        elif varTypeText == "bool":
            varType = Mini_0SymbolTable.Mini_0Type.BOOL

        if self.table.exists(varName):
            self.utils.addSemanticError(
                ctx.ID().getSymbol(), "Variable " + varName + " ya existe"
            )
        else:
            self.table.insert(varName, varType)

        return super().visitDeclvar(ctx)

    def visitCmdasign(self, ctx: Mini_0Parser.CmdasignContext):
        expressionType = self.utils.verifyTypeExpr(self.table, ctx.exp())
        if expressionType != Mini_0SymbolTable.Mini_0Type.INVALIDO:
            varName = ctx.var().getText()
            if not self.table.exists(varName):
                self.utils.addSemanticError(
                    ctx.var().ID().getSymbol(),
                    "Variable " + varName + " no fue declarada antes de uso",
                )
            else:
                varType = self.utils.verifyType(self.table, varName)
                if (
                    varType != expressionType
                    and expressionType != Mini_0SymbolTable.Mini_0Type.INVALIDO
                ):
                    self.utils.addSemanticError(
                        ctx.var().ID().getSymbol(),
                        "Tipo de la variable "
                        + varName
                        + " no es compatible con el tipo de la expresión",
                    )

        return super().visitCmdasign(ctx)

    def visitExprAritmetica(self, ctx: Mini_0Parser.ExprAritmeticaContext):
        self.utils.verifyTypeExpr(self.table, ctx)
        return super().visitExprAritmetica(ctx)
