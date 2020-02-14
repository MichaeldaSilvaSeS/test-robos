@negocio
Feature: Realizar cadastro de usuario
  Somente  isso
  
  Background:
  	Given Abrir a aplicacao de cadastro de usuario

  @negocio
  Scenario Outline: Cria usuario
    Given informado <nome> do usuario
    When pressionar salvar
		Then 1informa <resultado> para o usuario

    Examples: 
      | nome 		| resultado |
      | Michael | 	Sucesso |
