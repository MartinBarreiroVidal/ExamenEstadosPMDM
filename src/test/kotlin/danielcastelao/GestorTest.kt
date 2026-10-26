package danielcastelao

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class GestorTest {
    @Test
    fun comprobarEstadoInicial() {
        estado_actual = Estados.Idle
        nivel_actual = 0

        assertEquals(Estados.Idle, estado_actual)
        assertEquals(0, nivel_actual)
    }
    @Test
    fun comprobarSubidaExitosa () {
        estado_actual = Estados.Idle
        nivel_actual = 0

        nivel_1 = true
        gestor()

        assertEquals(Estados.MovingUP, estado_actual)
        assertEquals(2, nivel_actual)

        llegado = true
        gestor()

        assertEquals(Estados.Idle, estado_actual)
        assertEquals(1, nivel_actual)


    }
    @Test
    fun comprobarBajadaExitosa () {
        estado_actual = Estados.Idle
        nivel_actual = 1

        nivel_0 = true
        gestor()

        assertEquals(Estados.MovingDOWN, estado_actual)
        assertEquals(2, nivel_actual)

        llegado = true
        gestor()

        assertEquals(Estados.Idle, estado_actual)
        assertEquals(0, nivel_actual)


    }
    @Test
    fun comprobarCicloConFallo() {
        estado_actual = Estados.Idle
        nivel_actual = 0

        fallo = true
        gestor()

        assertEquals(Estados.Error, estado_actual)
        assertEquals(-1, nivel_actual)
    }
}