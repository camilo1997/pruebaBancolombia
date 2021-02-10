# Autor: camilo lopera
  @stories
  Feature: Academy Choucair
    As a user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @Scenario1
    Scenario: Search for a automation course
    Given than camilo wants to learn automation at the academy
    | srtUser    | srtPassword   |
    | 1017250077 | Choucair2021* |
    When he search for the course on the choucair academy
    | srtCourse                               |
    |  Prueba Técnica - Analista Bancolombia  |
    Then he finds the course called resources
    | srtCourse                               |
    |  Prueba Técnica - Analista Bancolombia  |