#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_001 Changer une pièce
 As a conducteur
 I want to changer une pièce
 So that ma voiture roule bien


  @tag1
Scenario Outline: Lea veut changer son pare-choc après son accrochage sur la A1 
 Given A Car
 When Lea ajoute une <piece>
 Then le car a une nouvelle pièce



Examples:
 |     piece      |
 |  " parechoc "  |
 |    " phare "   |
 |    " neon "    |
 |    " pneu "    |
 

      
@tag2
Scenario Outline: Léa a choisi un pare-choc non disponible
 Given une piece
 When Lea a ajouté une mauvaise <piece>
 Then un message qui indique que l’ajout est mauvais.
 
 Examples:
   | piece | 	message
   |   2   | not available

 
