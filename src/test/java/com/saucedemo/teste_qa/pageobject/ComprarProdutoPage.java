package com.saucedemo.teste_qa.pageobject;

import org.openqa.selenium.By;

public class ComprarProdutoPage {

	private String xpathProduto = "//*[contains(text(),'%1$s')]";

	private By cmpUser = By.xpath("//input[@id='user-name']");
	private By cmpPwd = By.xpath("//input[@id='password']");
	private By btnLgn = By.xpath("//input[@id='login-button']");
	private By btnOrder = By.xpath("//select[@class='product_sort_container']");
	private By btnAddCard = By.xpath("//button[contains(text(),'Add to cart')]");
	private By btnBack = By.xpath("//button[@id='back-to-products']");
	private By shpCrt = By.xpath("//div[@id='shopping_cart_container']");
	private By btnCkt = By.xpath("//button[contains(text(),'Checkout')]");
	private By cmpName = By.id("first-name");
	private By cmpLstName = By.id("last-name");
	private By cmpPost = By.id("postal-code");
	private By btnCtn = By.id("continue");
	private By btnFnsh = By.xpath("//*[contains(text(),'Finish')]");

	public By getCmpUser() {
		return cmpUser;
	}

	public By getCmpPwd() {
		return cmpPwd;
	}

	public By getBtnLgn() {
		return btnLgn;
	}

	public String getXpathProduto() {
		return xpathProduto;
	}

	public By getBtnAddCard() {
		return btnAddCard;
	}

	public By getBtnBack() {
		return btnBack;
	}

	public By getBtnOrder() {
		return btnOrder;
	}

	public By getShpCrt() {
		return shpCrt;
	}

	public By getBtnCkt() {
		return btnCkt;
	}

	public By getCmpName() {
		return cmpName;
	}

	public By getCmpLstName() {
		return cmpLstName;
	}

	public By getCmpPost() {
		return cmpPost;
	}

	public By getBtnCtn() {
		return btnCtn;
	}

	public By getFnsh() {
		return btnFnsh;
	}

}