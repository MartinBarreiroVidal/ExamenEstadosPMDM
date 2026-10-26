package danielcastelao


sealed class Estados {
    abstract fun siguienteEstado(nivel_0: Boolean, nivel_1: Boolean, fallo: Boolean, llegado: Boolean, nivel_actual: Int ): Estados

    object Idle : Estados() {
        override fun siguienteEstado(nivel_0: Boolean, nivel_1: Boolean, fallo: Boolean, llegado: Boolean, nivelActual: Int): Estados {
            if (fallo) return Error
            if (nivel_1 && nivel_actual == 0) return MovingUP
            if (nivel_0 && nivel_actual == 1) return MovingDOWN
            return this

        }
    }
    object MovingUP : Estados() {
        override fun siguienteEstado(nivel_0: Boolean, nivel_1: Boolean, fallo: Boolean, llegado: Boolean, nivelActual: Int): Estados {
            if (fallo) return Error
            if (llegado) return Idle
            return this
        }
    }

    object MovingDOWN: Estados() {
        override fun siguienteEstado(nivel_0: Boolean, nivel_1: Boolean, fallo: Boolean, llegado: Boolean, nivelActual: Int): Estados {
            if (fallo) return Error
            if (llegado) return Idle
            return this
        }
    }
    object Error: Estados() {
        override fun siguienteEstado(nivel_0: Boolean, nivel_1: Boolean, fallo: Boolean, llegado: Boolean, nivelActual: Int): Estados {
            return this
        }
    }
}