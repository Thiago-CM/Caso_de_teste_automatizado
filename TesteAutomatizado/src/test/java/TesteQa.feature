@tag1
Feature: Busca no Banco de Quest�es
Scenario: Busca por quest�o inexistente
  Given que navego para a p�gina de busca do banco de quest�es
  And digito 'Science: Computers' no campo de busca
  When clico no bot�o de buscar
  Then visualizo uma mensagem de erro com o texto 'No questions found.'
  
  @tag2
  Feature: Busca no banco de Categoria
  Scenario: Verificar listagem de categoria
    Given navego para a p�gina de busca do banco
    And Altero a busca por categoria no campo de op��es 
    And digito 'Science: Computers' no campo de busca
    When clico no bot�o de buscar
    Then verifico se a listagem de quest�es est� com 25 itens
    And verifico se o controle de pagina��o est� aparecendo
 
 @tag3
 Feature: Verificar requisito para cadastrar quest�o
 Scenario: informar o usuario que para cadastar quest�o tem que estar logado
   Given navego para a pagina inicial
   When clico no bot�o add new questions
   Then visualizo a mensagem de erro 'ERROR! You must be logged in to submit a trivia question.'
 
 
 