Feature: Yo como cliente de bancolombia
  deseo eliminar un usuario 
  para tener mantener el sistema actualizad0 

  @DeleteUser
  Scenario Outline: Usuario Delete Parametrizado
    Given Dado que el usuario esta en la pagina de CeibaProyectoFinal
    When el usuario realiza click en la opcion Manage Customer
    And el usuario realiza click en la opcion Delete <identificacion>
    And el usuario realiza click en el boton Delete
    Then validacion exitosa Eliminacion <identificacion>

    Examples: 
      | identificacion |
      |          98536 |