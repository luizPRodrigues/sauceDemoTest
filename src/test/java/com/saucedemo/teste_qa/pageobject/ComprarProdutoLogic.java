package com.saucedemo.teste_qa.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.saucedemo.teste_qa.core.utils.WebActions;

public class ComprarProdutoLogic extends WebActions {

	private static ComprarProdutoPage comprarProdutoPage;

	public ComprarProdutoLogic() {
		comprarProdutoPage = new ComprarProdutoPage();
	}

	public void inserirUsuario(String usuario) {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getCmpUser());
		limpaEInsereTexto(usuario, comprarProdutoPage.getCmpUser());
	}

	public void inserirSenha(String senha) {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getCmpPwd());
		limpaEInsereTexto(senha, comprarProdutoPage.getCmpPwd());

	}

	public void clicarEmLogar() {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnLgn());
		clicar(comprarProdutoPage.getBtnLgn());

	}

	public void ordenarProdutos(String ordem) {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnOrder());
		selecionarComboPorTextoVisivel(comprarProdutoPage.getBtnOrder(), ordem);

	}

	public void selecionarPrimeiroProduto(String produto1) {
		String prod1 = String.format(comprarProdutoPage.getXpathProduto(), produto1);
		WebElement xpathEl1 = WebActions.getWebDriver().findElement(By.xpath(prod1));
		elementoWebclick(xpathEl1);
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnAddCard());
		clicar(comprarProdutoPage.getBtnAddCard());
		espera(2);
		clicar(comprarProdutoPage.getBtnBack());

	}

	public void selecionarSegundoProduto(String produto2) {
		String prod2 = String.format(comprarProdutoPage.getXpathProduto(), produto2);
		WebElement xpathEl2 = WebActions.getWebDriver().findElement(By.xpath(prod2));
		elementoWebclick(xpathEl2);
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnAddCard());
		clicar(comprarProdutoPage.getBtnAddCard());
		espera(2);
		clicar(comprarProdutoPage.getBtnBack());

	}

	public void clicarCarrinhoDeCompras() {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getShpCrt());
		clicar(comprarProdutoPage.getShpCrt());
	}

	public void clicarCheckOut() {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnCkt());
		clicar(comprarProdutoPage.getBtnCkt());
	}

	public void preencherInformacoesPessoais(String firstName, String lastName, String postalCode) {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getCmpName());
		limpaEInsereTexto(firstName, comprarProdutoPage.getCmpName());
		espera(3);
		esperarAteElementoEstarClicavel(comprarProdutoPage.getCmpLstName());
		limpaEInsereTexto(lastName, comprarProdutoPage.getCmpLstName());
		espera(3);
		esperarAteElementoEstarClicavel(comprarProdutoPage.getCmpPost());
		limpaEInsereTexto(postalCode, comprarProdutoPage.getCmpPost());

	}

	public void clicarContinuar() {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getBtnCtn());
		clicar(comprarProdutoPage.getBtnCtn());

	}

	public void finalizarCompra() {
		esperarAteElementoEstarClicavel(comprarProdutoPage.getFnsh());
		clicar(comprarProdutoPage.getFnsh());

	}

	public void validarCompra(String msgFinal) {
		String mensagem = String.format(comprarProdutoPage.getXpathProduto(), msgFinal);
		WebElement xpathMensagem = driver.findElement(By.xpath(mensagem));
		try {
			wait.until(ExpectedConditions.visibilityOf(xpathMensagem));
			System.out.println(msgFinal + " validado com sucesso");
			espera(63);
		} catch (Exception e) {
			System.out.println("Validacao falhou");
			org.junit.Assert.assertTrue(xpathMensagem.isDisplayed());
		}

	}
}
