package clases

abstract class Electrodomesticos(
    private var numeroSerie: String,
    private var tipo: TipoElectrodomesticos,
    private var color: Colores,
    private var peso: Double,
    private var precio: Double
) {
    init {
        contadorInstancias++
    }

    companion object {
        var contadorInstancias = 0
    }


    override fun toString(): String {
        return """
            _________________________________
            Numero de Serie: $numeroSerie
            Tipo: ${tipo.toString().toLowerCase().capitalize()}
            Color: ${color.toString().toLowerCase().capitalize()}
            Peso: $peso kg.
            Precio: $$precio
            
        """.trimIndent()
    }
}

enum class TipoElectrodomesticos {
    LAVADORA,
    MICROONDAS,
    REFRIGERADOR
}

enum class Colores {
    BLANCO,
    NEGRO,
    GRIS
}
