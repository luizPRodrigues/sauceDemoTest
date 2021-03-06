package com.saucedemo.teste_qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features = "src/test/java/com/saucedemo/teste_qa/feature/comprarProduto.feature",
		        glue = { "" },
                plugin = {"pretty"},
                monochrome = true,
                snippets = SnippetType.CAMELCASE,
                dryRun = false
                )
public class ComprarProdutoRunner {
	
	}


