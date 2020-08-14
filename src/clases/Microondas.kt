package clases

class Microondas(
    numeroSerie: String,
    tipo: TipoElectrodomesticos,
    color: Colores,
    peso: Double,
    precio: Double,
    private var potencia: Double
) : Electrodomesticos(numeroSerie, tipo, color, peso, precio) {
    override fun toString(): String {
        return super.toString() + """
            Potencia: $potencia watts.
        """.trimIndent()
    }
}