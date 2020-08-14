package clases

import java.text.DecimalFormat
import kotlin.system.exitProcess

class Cuenta(private var clabe: String, private var titular: String, private var saldo: Double) {

    companion object {
        const val DEPOSITO: Int = 1
        const val RETIRO: Int = 2
    }

    private var opcion = 0
    private var monto = 0.0
    private fun inicio() {
        print("Ingrese una opcion:")
        opcion = readLine()!!.toInt()
    }

    private fun montoBanco() {
        print(
            "Ingrese monto a ${
            if (opcion == DEPOSITO) {
                "Depositar: $"
            } else "Retirar: $"
            }"
        )
        monto = readLine()!!.toDouble()
    }

    private fun montoWhile() {
        while (opcion == RETIRO && monto > saldo) {
            println("Saldo insuficiente, intente otra cantidad")
            montoBanco()
        }
    }

    fun ingresarMonto() {
        try {
            montoBanco()
            montoWhile()
        } catch (e: NumberFormatException) {
            println("Opcion invalida, Intente de nuevo")
            ingresarMonto()
        }
    }

    fun elegirMovimiento() {
        try {
            inicio()
            if (opcion != RETIRO && opcion != DEPOSITO) {
                exitProcess(0)
            }
        } catch (e: NumberFormatException) {
            exitProcess(0)
        }
    }

    private val formato = "#,###.##"
    fun imprimirRecibo() {

        val saldoTotal = when (opcion) {
            DEPOSITO -> saldo + monto
            else -> saldo - monto
        }

        println(
            """
                
            --------------Recibo--------------

            Clabe: $clabe - Titular: $titular
            Movimiento: ${if (opcion == DEPOSITO) "Depósito" else "Retiro"}
            Monto: $${DecimalFormat(formato).format(monto)}
            Saldo Anterior: $${DecimalFormat(formato).format(saldo)}
            Nuevo Saldo: $${DecimalFormat(formato).format(saldoTotal)}
        """.trimIndent()
        )
        saldo = saldoTotal
    }

}