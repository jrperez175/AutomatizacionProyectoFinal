Feature: Yo como cliente de bancolombia
  deseo modificar un usuario 
  para tener su informacion actualizada 

  @EditUser
  Scenario Outline: Usuario Editado Parametrizado
    Given Dado que el usuario esta en la pagina de CeibaProyectoFinal
    When el usuario realiza click en la opcion Manage Customer
    And el usuario hace click en la opcion Editar <identificacion>
    #And el usuario digita Identificacion <identificacion>
    And el usuario digita Razon Social <razon>
    #And el usuario digita Ciudad <ciudad>
    #And el usuario digita Tipo de Cliente <tipo>
    #And el usuario digita Nivel de Riesgo <nivel>
    And el usuario realiza click en el boton Save
    Then validacion exitosa Modificacion de la razon social <razon> del id <identificacion> 

    Examples: 
      | identificacion | razon | ciudad   | tipo  | nivel         |
      |          98536 | XXXX  | Bogota | Super Elite | Postgrado |