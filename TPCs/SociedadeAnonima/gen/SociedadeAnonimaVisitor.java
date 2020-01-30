// Generated from /Users/rafaelsilva/Desktop/work_space/GCS-1920/SociedadeAnonima/src/SociedadeAnonima.g4 by ANTLR 4.7.2

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SociedadeAnonimaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SociedadeAnonimaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#empresa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpresa(SociedadeAnonimaParser.EmpresaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#sociedadeAnonimas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSociedadeAnonimas(SociedadeAnonimaParser.SociedadeAnonimasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#sociedadeAnonima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSociedadeAnonima(SociedadeAnonimaParser.SociedadeAnonimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#nomeEmpresa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeEmpresa(SociedadeAnonimaParser.NomeEmpresaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#localizacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalizacao(SociedadeAnonimaParser.LocalizacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#cidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidade(SociedadeAnonimaParser.CidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#rua}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRua(SociedadeAnonimaParser.RuaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#objetivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivo(SociedadeAnonimaParser.ObjetivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#ramo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRamo(SociedadeAnonimaParser.RamoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#socios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSocios(SociedadeAnonimaParser.SociosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#socio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSocio(SociedadeAnonimaParser.SocioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(SociedadeAnonimaParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#capital}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapital(SociedadeAnonimaParser.CapitalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#cota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCota(SociedadeAnonimaParser.CotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#papel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPapel(SociedadeAnonimaParser.PapelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#funcionarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionarios(SociedadeAnonimaParser.FuncionariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#funcionario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionario(SociedadeAnonimaParser.FuncionarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#numeroMecanografico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroMecanografico(SociedadeAnonimaParser.NumeroMecanograficoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#dataNascimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataNascimento(SociedadeAnonimaParser.DataNascimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#contactos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContactos(SociedadeAnonimaParser.ContactosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#contacto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContacto(SociedadeAnonimaParser.ContactoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#telemovel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTelemovel(SociedadeAnonimaParser.TelemovelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(SociedadeAnonimaParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(SociedadeAnonimaParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(SociedadeAnonimaParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#assembleiaGerais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembleiaGerais(SociedadeAnonimaParser.AssembleiaGeraisContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#assembleiaGeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembleiaGeral(SociedadeAnonimaParser.AssembleiaGeralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SociedadeAnonimaParser#listaSocios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaSocios(SociedadeAnonimaParser.ListaSociosContext ctx);
}