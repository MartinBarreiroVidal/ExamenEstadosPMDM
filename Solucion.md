## Examen Máquina de Estados - Halo Vigo - Martín Barreiro

### Tipo de Variables:

Tendremos que declarar el nivel actual, que se inicializará en 0, para indicar en qué nivel se encuentra el ascensor.

Declararemos tambien, el estado actual del ascensor.

Antes de entrar a la funcion del cambio de estados, tendremos que declarar la botonera interior del ascensor (nivel_0 y nivel_1)

Existen tres tipos de valores para los niveles:

0: Nivel Avenida G. Barbón

1: Nivel Plaza de Compostela

2: El mecanismo se encuentra en movimiento, no está en ningún nivel.

-1: Error



Tambien un fallo para que salte un error si eso ocurre y un "llegado" para indicar el éxito, las 2 variables boolean.


### Estados:

- Primero declararemos los estados, que ya nos los dio Damián, serán: Idle, MovingUP, MovingDOWN y Error.


 - Si queremos ir al nivel 1, estando actualmente en el 0, tendremos que retornar MovingUP ya que queremos ir hacia arriba.
   Al igual que si estamos en el nivel 1, y queremos ir al 0, retornaremos MovingDOWN para bajar. Se tienen que cumplir estas 2 condiciones.


- Ya hecho esto, nos toca gestionar lo que pasaría en MovingUP y MovingDOWN:

    Aquí tendremos que tener muy en cuenta las variables "fallo" para que salte el error y "llegado" para retornar al Idle y que vuelva a empezar ya que todo está bien.

    Por último declaramos el error, que saltará cada vez que se le llame.


### Transiciones:

 - Como primer paso, tendremos que "reiniciar" el ascensor para que las variables estén como empieza el ascensor.
Aquí, se abre un if para que, dependiendo de que planta elijas, te lleve al nivel 0 (G. Barbón) o al nivel 1 (Plaza de Compostela). También declaré un error por si se seleccionaba una de estas opciones. 


- Al subir, el ascensor se encuentra en movimiento, asi que, como se indica, el nivel actual tiene que ser 2.


- Ocurre lo mismo al bajar, se encuentra en movimiento asi que nivel actual = 2


- En el error, seleccionamos la variable -1, que era la indicada del nivel error.

### Test:

- 1º TEST

Este primer test comprueba el estado oficial de la máquina, comparamos Estados.Idle con estado_actual:

![Captura desde 2026-10-26 10-18-02.png](capturas/Captura%20desde%202026-10-26%2010-18-02.png)

- 2º TEST

Con el segundo test simulamos que hemos pulsado el nivel 1, para subir de planta y comprobar si la subida es exitosa.
Simulamos que el ascensor llega a su destino con llegado = true y para finalizar comprobamos que vuelve a Idle y el nivel actual se actualiza a 1. Nos mostrará el mensaje "Subiendo..."

![Captura desde 2026-10-26 10-29-26.png](capturas/Captura%20desde%202026-10-26%2010-29-26.png)

- 3º TEST

Con el tercer test simulamos que hemos pulsado el nivel 0 , para bajar de planta y comprobar si la bajada es exitosa.
Es como el anterior, simulamos que el ascensor llega a su destino con llegado = true y para finalizar comprobamos que vuelve a Idle y el nivel actual se actualiza a 0. Nos mostrará el mensaje "Bajando..."

![Captura desde 2026-10-26 10-31-50.png](capturas/Captura%20desde%202026-10-26%2010-31-50.png)

- 4º TEST

El cuarto y último test simularemos que hay un fallo, declarando "fallo = true" despues comprobamos que salta el error y cambiamos el estado a -1, que tiene la variable error.

Nos dará un resultado en el que el ascensor ni sube ni baja, es lo que queremos comprobar. Si esto sale bien, no hay mensaje de "Subiedo..." o "Bajando...":

![Captura desde 2026-10-26 10-38-29.png](capturas/Captura%20desde%202026-10-26%2010-38-29.png)