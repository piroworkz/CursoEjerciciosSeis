package ejercicioBanco

import clases.Cuenta


val cuenta = Cuenta("01-8547-9", "Alberto Palma", 5000.0)

fun main() {
    println(
        """
        ______________________
        Menú

        1-Deposito

        2-Retiro
        ______________________
    """.trimIndent()
    )

    cuenta.elegirMovimiento()
    cuenta.ingresarMonto()
    cuenta.imprimirRecibo()
    main()
}