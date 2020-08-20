@ComprobarPdfs
Feature: Comprobar en la pagina de Tocumen que los pdfs sean los correctos

  Background:
    Given Que usuario esta en la pagina

  @ObjetosExtraviados
  Scenario Outline: Comprobar el pdf es correcto para Politicas de Objetos Extraviados
    When El abre el pdf de politicas de objetos extraviados
    Then Valida que el pdf <namePdf> sea el correcto
    Examples:
      | namePdf                           |
      | politicas-objetos-extraviados.pdf |


  @EjecucionPersupuestaria
  Scenario Outline: Comprobar el pdf es correcto para Ejecución Presupuestaria julio 2020
    When El abre el pdf de Ejecución Presupuestaria julio 2020
    Then Valida que el pdf <namePdf> sea el correcto

    Examples:
      | namePdf                       |
      | Presupuestaria_julio_2020.pdf |

