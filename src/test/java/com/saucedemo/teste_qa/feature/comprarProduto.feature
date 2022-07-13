Feature: 
  Comprar produto com sucesso
  Eu como usuario final do site saucedemo
  Quero acessar o site para realizar compras

  
  Scenario Outline: Compra de produto com sucesso
    Given Navego para a pagina inicial do site saucedemo
    And preencho usuario "<usuario>" e preencho senha "<senha>"
    And clico em logar
    And ordeno os produtos pelo valor "<ordem>"
    And adiciono o primeiro produto "<produto1>"
    And adiciono o segundo produto "<produto2>"
    And clico no carrinho de compras
    And clico no botao checkout
    And preecho informacoes pessoais "firstName" e "<lastName>" e "<postalCode>"
    And clico em continuar
    When clico em finalizar compra   
    Then valido compra efetuada com sucesso "<msgFinal>"

    Examples: 
      | usuario       | senha        |ordem              | produto1         | produto2                          | firstName | lastName | postalCode | msgFinal                 |
      | standard_user | secret_sauce |Price (low to high)|Sauce Labs Onesie | Test.allTheThings() T-Shirt (Red) | teste     | qa       |   06692140 | THANK YOU FOR YOUR ORDER |
