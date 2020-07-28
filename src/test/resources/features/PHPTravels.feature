Feature: Como usuario quiero navegar por PHPTravel y completar una reserva.

  @SmokeTravel
  Scenario Outline: El cliente busca un hotel y con sus datos completa una reserva como invitado
    Given El cliente abre la aplicacion PHPTravel
    When El cliente presiona Hotel
    And El cliente ingresa el destino <destino>
    And El cliente selecciona el dia de entrada <entrada>
    And El cliente selecciona el dia de salida <salida>
    And El cliente presiona buscar
    And El cliente selecciona el primer resultado
    And El cliente selecciona la habitacion
    And El cliente ingresa el nombre del titular de la tarjeta <titular>
    And El cliente ingresa el numero de la tarjeta <numeroTarjeta>
    And El cliente ingresa el vencimiento de la tarjeta <mesaño>
    And El cliente ingresa el cvv de la tarjeta <cvv>
    And El cliente ingresa su nombre <nombre>
    And El cliente ingresa su apellido <apellido>
    And El cliente ingresa su correo <email>
    And El cliente ingresa su telefono <telefono>
    And El cliente presiona Continuar



    Examples:
      | destino|  entrada | salida | nombre | apellido | email                     | pais      | telefono   | titular          | numeroTarjeta   | mesaño | cvv|
      | mendoza| 18       | 26     | Javier | Escudero | javier.e.a.1998@gmail.com | Argentina | 2634328078 | Nombre de titular|4263982640269299 | 0223   | 837|