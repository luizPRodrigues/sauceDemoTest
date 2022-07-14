package com.saucedemo.teste_qa.pageobject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.saucedemo.teste_qa.core.utils.WebActions;

public class ComprarProdutoSteps extends WebActions {
	private static ComprarProdutoLogic comprarProdutoLogic;

	public ComprarProdutoSteps() {
		comprarProdutoLogic = new ComprarProdutoLogic();
	}

	@Given("Navego para a pagina inicial do site saucedemo")
	public void navegoParaAPaginaInicialDoSiteSaucedemo() {
		navega("https://www.saucedemo.com");
	}

	@Given("preencho usuario {string} e preencho senha {string}")
	public void preenchoUsuarioEPreenchoSenha(String usuario, String senha) {
		comprarProdutoLogic.inserirUsuario(usuario);
		comprarProdutoLogic.inserirSenha(senha);
	}

	@Given("clico em logar")
	public void clicoEmLogar() {
		comprarProdutoLogic.clicarEmLogar();

	}

	@Given("ordeno os produtos pelo valor {string}")
	public void ordenoOsProdutosPeloValor(String ordem) {
		comprarProdutoLogic.ordenarProdutos(ordem);

	}

	@Given("adiciono o primeiro produto {string}")
	public void adicionoOPrimeiroProduto(String produto1) {
		comprarProdutoLogic.selecionarPrimeiroProduto(produto1);
	}

	@Given("adiciono o segundo produto {string}")
	public void adicionoOSegundoProduto(String produto2) {
		comprarProdutoLogic.selecionarSegundoProduto(produto2);

	}

	@Given("clico no carrinho de compras")
	public void clicoNoCarrinhoDeCompras() {
		comprarProdutoLogic.clicarCarrinhoDeCompras();

	}

	@Given("clico no botao checkout")
	public void clicoNoBotaoCheckout() {
		comprarProdutoLogic.clicarCheckOut();
	}

	@Given("preecho informacoes pessoais {string} e {string} e {string}")
	public void preechoInformacoesPessoaisEE(String firstName, String lastName, String postalCode) {
		comprarProdutoLogic.preencherInformacoesPessoais(firstName, lastName, postalCode);
	}

	@Given("clico em continuar")
	public void clicoEmContinuar() {
		comprarProdutoLogic.clicarContinuar();
	}

	@When("clico em finalizar compra")
	public void clicoEmFinalizarCompra() {
		comprarProdutoLogic.finalizarCompra();

	}

	@Then("valido compra efetuada com sucesso {string}")
	public void validoCompraEfetuadaComSucesso(String msgFinal) {
		comprarProdutoLogic.validarCompra(msgFinal);
	}

}
