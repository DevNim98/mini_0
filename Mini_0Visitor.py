# Generated from Mini_0.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Mini_0Parser import Mini_0Parser
else:
    from Mini_0Parser import Mini_0Parser

# This class defines a complete generic visitor for a parse tree produced by Mini_0Parser.

class Mini_0Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by Mini_0Parser#programa.
    def visitPrograma(self, ctx:Mini_0Parser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#comando.
    def visitComando(self, ctx:Mini_0Parser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#listadecl.
    def visitListadecl(self, ctx:Mini_0Parser.ListadeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#decl.
    def visitDecl(self, ctx:Mini_0Parser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#nl.
    def visitNl(self, ctx:Mini_0Parser.NlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#glbal.
    def visitGlbal(self, ctx:Mini_0Parser.GlbalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#funcion.
    def visitFuncion(self, ctx:Mini_0Parser.FuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#listaBloque.
    def visitListaBloque(self, ctx:Mini_0Parser.ListaBloqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#bloque.
    def visitBloque(self, ctx:Mini_0Parser.BloqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#listaComando.
    def visitListaComando(self, ctx:Mini_0Parser.ListaComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#params.
    def visitParams(self, ctx:Mini_0Parser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#parametro.
    def visitParametro(self, ctx:Mini_0Parser.ParametroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#tipobase.
    def visitTipobase(self, ctx:Mini_0Parser.TipobaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#tipo.
    def visitTipo(self, ctx:Mini_0Parser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#var.
    def visitVar(self, ctx:Mini_0Parser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#declvar.
    def visitDeclvar(self, ctx:Mini_0Parser.DeclvarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#cmdif.
    def visitCmdif(self, ctx:Mini_0Parser.CmdifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#cmdwhile.
    def visitCmdwhile(self, ctx:Mini_0Parser.CmdwhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#cmdasign.
    def visitCmdasign(self, ctx:Mini_0Parser.CmdasignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#llamada.
    def visitLlamada(self, ctx:Mini_0Parser.LlamadaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#listaexp.
    def visitListaexp(self, ctx:Mini_0Parser.ListaexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#cmdreturn.
    def visitCmdreturn(self, ctx:Mini_0Parser.CmdreturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#op1.
    def visitOp1(self, ctx:Mini_0Parser.Op1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#op2.
    def visitOp2(self, ctx:Mini_0Parser.Op2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#exprAritmetica.
    def visitExprAritmetica(self, ctx:Mini_0Parser.ExprAritmeticaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#termAritmetico.
    def visitTermAritmetico(self, ctx:Mini_0Parser.TermAritmeticoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#factorAritmetico.
    def visitFactorAritmetico(self, ctx:Mini_0Parser.FactorAritmeticoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#exprRelacional.
    def visitExprRelacional(self, ctx:Mini_0Parser.ExprRelacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#termRelacional.
    def visitTermRelacional(self, ctx:Mini_0Parser.TermRelacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini_0Parser#exp.
    def visitExp(self, ctx:Mini_0Parser.ExpContext):
        return self.visitChildren(ctx)



del Mini_0Parser