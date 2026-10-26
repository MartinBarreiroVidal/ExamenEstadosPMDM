## Examen Máquina de Estados - Halo Vigo

### Tipo de Variables:

Tendremos que declarar el nivel actual, que se inicializará en 0, para indicar en qué nivel se encuentra el ascensor.

Declararemos tambien, el estado actual del ascensor.

Antes de entrar a la funcion del cambio de estados, tendremos que declarar la botonera interior del ascensor (nivel_0 y nivel_1)

Nivel 0: Nivel Avenida G. Barbón
Nivel 1: Nivel Plaza de Compostela


Tambien un fallo para que salte un error si eso ocurre y un "llegado" para indicar el éxito, las 2 variables boolean.


### Estados:

Primero declararemos los estados, que ya nos los dio Damián, serán: Idle, MovingUP, MovingDOWN y Error.

Si queremos ir al nivel 1, estando actualmente en el 0, tendremos que retornar MovingUP ya que queremos ir hacia arriba.
Al igual que si estamos en el nivel 1, y queremos ir al 0, retornaremos MovingDOWN para bajar. Se tienen que cumplir estas 2 condiciones.

Ya hecho esto, nos toca gestionar lo que pasaría en MovingUP y MovingDOWN:

Aquí tendremos que tener muy en cuenta las variables "fallo" para que salte el error y "llegado" para retornar al Idle y que vuelva a empezar ya que todo está bien.

Por último declaramos el error, que saltará cada vez que se le llame.