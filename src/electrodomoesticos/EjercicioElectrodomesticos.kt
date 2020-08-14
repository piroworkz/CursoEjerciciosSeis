package electrodomoesticos

import clases.*

fun main() {
    generarLista()
}

fun generarLista() {
    val listaelectrodomesticos = arrayListOf<Electrodomesticos>()
    val lavadora = Lavadora("SD5S84DRTR", TipoElectrodomesticos.LAVADORA, Colores.BLANCO, 25.0, 9500.00, 18.0)
    val microondas = Microondas("AOS87DPSOR", TipoElectrodomesticos.MICROONDAS, Colores.NEGRO, 8.5, 2100.00, 1350.0)
    val refrigerador =
        Refrigerador("SPDO8756SR", TipoElectrodomesticos.REFRIGERADOR, Colores.GRIS, 47.0, 7899.00, 10.0, 0.0, -15.0)
    listaelectrodomesticos.add(lavadora)
    listaelectrodomesticos.add(microondas)
    listaelectrodomesticos.add(refrigerador)

    for (i in listaelectrodomesticos)
        println(i)
}

