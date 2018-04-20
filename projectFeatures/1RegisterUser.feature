Feature: Yo como cliente de bancolombia
  deseo crear un usuario 
  para popder navegar por la pagina

  @RegisterUser
  Scenario Outline: Usuario Exitoso Parametrizado
    Given Dado que el usuario esta en la pagina de CeibaProyectoFinal
    When el usuario realiza click en la opcion Manage Customer
    And el usuario realiza click en la opcion Create New
    And el usuario ingresa Identificacion <identificacion>
    And el usuario ingresa Razon Social <razon>
    And el usuario ingresa Ciudad <ciudad>
    And el usuario ingresa Tipo de Cliente <tipo>
    And el usuario ingresa Nivel de Riesgo <nivel>
    And el usuario realiza click en el boton Create
    Then validacion exitosa Creacion <identificacion>

    Examples: 
      | identificacion | razon | ciudad   | tipo  | nivel         |
      |          98536 | JRPM  | Medellin | Elite | Universitario |
