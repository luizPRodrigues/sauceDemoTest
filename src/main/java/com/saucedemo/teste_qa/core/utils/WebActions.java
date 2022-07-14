package com.saucedemo.teste_qa.core.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.teste_qa.core.driver.DriverFactory;

import io.cucumber.java.Status;

public class WebActions extends DriverFactory {

	public static WebDriver getWebDriver() {
		return driver;
	}

	/**
	 * metodo de clique no elemento desejado
	 * 
	 * @param elemento
	 */
	public static void clicar(By elemento) {
		acharElemento(elemento).click();
	}

	public WebDriver elementoWebclick(WebElement elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
		elemento.click();
		return driver;
	}

	/**
	 * metodo de espera implicita aguarda o elemento estar clicavel
	 * 
	 * @param elemento
	 */
	public void esperarAteElementoEstarClicavel(By elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	/**
	 * encontra o elemento By desejado
	 * 
	 * @param elemento desejado
	 * @return o elemento encontrado
	 */
	public static WebElement acharElemento(By elemento) {
		return driver.findElement(elemento);
	}

	/**
	 * acha o campo desejado, limpa e insere o texto passado como parametro
	 * 
	 * @param texto a ser inserido,
	 * @param campo a ser preenchido
	 */

	public static void limpaEInsereTexto(String texto, By campo) {
		if (acharElemento(campo).isDisplayed()) {
			acharElemento(campo).clear();
			espera(500);
			acharElemento(campo).sendKeys(texto);
		}
	}

	/**
	 * metodo de espera explicita
	 * 
	 * @param tempo em milissegundos
	 */

	public static void espera(int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * seleciona a opção de um combo pelo seu texto visivel
	 * 
	 * @param elemento combo
	 * @param texto    visivel
	 */

	public static void selecionarComboPorTextoVisivel(By by, String visibleText) {
		WebElement element = acharElemento(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(visibleText);
	}

	/**
	 * tira screenshot e armazena na pasta Evidencias segmentado pelo status do
	 * teste
	 * 
	 */
	public void screenshot(Status status, String nomeTeste) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) DriverFactory.createChrome();
			File fnt = fonte.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fnt,
					new File("Evidencias" + File.separator + status + File.separator + nomeTeste + ".jpg"));
		} catch (Exception e) {
			System.out.println("Erro na Escrita de arquivo.");
		}
	}

	public static boolean estaVisivel(By elemento) {
		return driver.findElement(elemento).isDisplayed();
	}

}
