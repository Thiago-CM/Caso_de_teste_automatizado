@tag1
Feature: Busca no Banco de Questões
Scenario: Busca por questão inexistente
  Given que navego para a página de busca do banco de questões
  And digito 'Science: Computers' no campo de busca
  When clico no botão de buscar
  Then visualizo uma mensagem de erro com o texto 'No questions found.'
  
  @tag2
  Feature: Busca no banco de Categoria
  Scenario: Verificar listagem de categoria
    Given navego para a página de busca do banco
    And Altero a busca por categoria no campo de opções 
    And digito 'Science: Computers' no campo de busca
    When clico no botão de buscar
    Then verifico se a listagem de questões está com 25 itens
    And verifico se o controle de paginação está aparecendo
 
 @tag3
 Feature: Verificar requisito para cadastrar questão
 Scenario: informar o usuario que para cadastar questão tem que estar logado
   Given navego para a pagina inicial
   When clico no botão add new questions
   Then visualizo a mensagem de erro 'ERROR! You must be logged in to submit a trivia question.'
 
 
 