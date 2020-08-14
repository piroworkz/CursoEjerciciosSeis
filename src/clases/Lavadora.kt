package clases

class Lavadora(
    numeroSerie: String,
    tipo: TipoElectrodomesticos,
    color: Colores,
    peso: Double,
    precio: Double,
    private var capacidadKg: Double
) : Electrodomesticos(numeroSerie, tipo, color, peso, precio) {

    override fun toString(): String {
        return super.toString() + """
            Capacidad:$capacidadKg kg.
        """.trimIndent()
    }
}