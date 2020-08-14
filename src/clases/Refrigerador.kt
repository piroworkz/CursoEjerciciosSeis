package clases

class Refrigerador(
    numeroSerie: String,
    tipo: TipoElectrodomesticos,
    color: Colores,
    peso: Double,
    precio: Double,
    private var capacidadPies: Double,
    private var minTemp: Double,
    private var minTempFrzr: Double
) : Electrodomesticos(numeroSerie, tipo, color, peso, precio) {
    override fun toString(): String {
        return super.toString() + """
            Capacidad: $capacidadPies ft.
            Temperatura mínima: [$minTemp ºC conservador]
                                [$minTempFrzr ºC congelador]
        """.trimIndent()
    }

}