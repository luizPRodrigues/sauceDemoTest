package com.saucedemo.teste_qa.core.hooks;

import com.saucedemo.teste_qa.core.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.saucedemo.teste_qa.core.utils.WebActions;

public class Hooks extends DriverFactory {
	@Before
	public static void inicializaBrowser(Scenario teste) {
		System.out.println("Inicio do teste: " + teste.getName());
	}

	@After
	public static void finalizarTeste(Scenario teste) {
		new WebActions().screenshot(teste.getStatus(), teste.getName());
		System.out.println("Teste finalizado. Status do Teste: " + teste.getStatus());
		encerraDriver();
	}
}
