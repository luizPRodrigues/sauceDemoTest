# sauceDemoTest

## Descrição

O projeto de automação saceDemoTest possibilita a execução web local através do navegador chrome 

## Configuração do ambiente de desenvolvimento 

Pré- requisitos
* [Java] 17.0.1

* [Eclipse] versão mais atual

## Clone do projeto

Abra o prompt, entre na pasta de sua workspace e digite o seguinte comando:

* git clone https://github.com/luizPRodrigues/sauceDemoTest.git

## Configuração do WebDriver

Baixe a versão do chrome de acordo com o seu sistema operacional, compatível com a versão em sua máquina no seguinte site:

* https://sites.google.com/chromium.org/driver/

Extraia o arquivo na pasta chromedriver:

* /teste-qa/src/main/java/com/saucedemo/teste_qa/core/chromedriver

No caso de execução no Mac OSX alterar o caminho que aponta para o executável contido na classe driverFactory da seguinte forma:

* "/src/main/java/com/saucedemo/teste_qa/core/chromedriver/chromedriver"


Execução:

* Na classe ComprarProdutoRunner clicar com o botão direito + Run as + JUnit + Test

## Estrutura

O projeto está estruturado em quatro pacotes principais:

* core, feature, pageobject e runner. 

No pacote core existem as funcionalidades que dão suporte 
aos testes:

* utilitário de driver, hooks e util contendo métodos genéricos. 

* No pacote feature possui o arquivo .feature contendo a história de usuário e as steps no formato BDD com plugin do Cucumber.


No pacote pageObject possui as seguintes camadas de abstração: 

* Page- Na camada Page é onde ficam os mapeamentos de elementos com seus devidos retornos.

* Logic- Na camada Logic é onde foi criado metodos logicos para interação com os objetos da camada page.

* Step- Na camada Step é onde são assossiados os passos da estrutura do BDD com a estrutura lógica.

* Runner- Na camada Runner é onde é chamado o cenário a ser executado.
