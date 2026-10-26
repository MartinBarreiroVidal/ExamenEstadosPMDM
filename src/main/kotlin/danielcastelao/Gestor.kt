package danielcastelao

var nivel_actual: Int = 0
var estado_actual: Estados = Estados.Idle

var nivel_0: Boolean = false
var nivel_1: Boolean = false
var fallo: Boolean = false
var llegado: Boolean = false

fun gestor(): Int {
    estado_actual = estado_actual.siguienteEstado(nivel_0, nivel_1, fallo, llegado, nivel_actual)

    when (estado_actual) {
        is Estados.Idle -> {
            if (llegado) {
                if (nivel_1) nivel_actual = 1

                if (nivel_0) nivel_actual = 0

                nivel_0 = false
                nivel_1 = false
                llegado = false

            } else {
                estado_actual = Estados.Error
                println("Nivel seleccionado NO disponible")
                println("")
            }
            return nivel_actual
            estado_actual = Estados.MovingUP

        }
        is Estados.MovingUP -> {
            println("Subiendo...")
            println("")
            nivel_actual = 2

            return nivel_actual
            estado_actual = Estados.MovingDOWN
        }
        is Estados.MovingDOWN -> {
            println("Bajando...")
            println("")
            nivel_actual = 2
            return nivel_actual
        }
        is Estados.Error -> {
            nivel_actual = -1
            return nivel_actual
        }
    }
}