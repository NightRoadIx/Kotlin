/*
 * Enumeraciones
 * En los programas, en ocasiones surge la necesidad de tipos de
 * datos que solamente tomen ciertos valores. Es por ello que se
 * generaron las enumeraciones, las cuales son listas de constantes.
 * A diferencia de Java, las enumeraciones son clases.
 * Hay algunos importantes aspectos de las enumeraciones en Kotlin:
 * 1.- No se trata de simples colecciones de constantes, ya que
 *     cuentan con propiedades, métodos.
 * 2.- Cada una de las constantes actúan como instancias por separado
 *     de la clase y separados por comas
 * 3.- Las enumeraciones incrementan la legibilidad del código al
 *     pre-asignar nombres predefinidos a las constantes
 * 4.- Una instancia de una enumeración de clase no puede ser creado
 *     usando constructores
 *
 * */

// Enumeración
enum class DIAS {
	LUNES,
	MARTES,
	MIERCOLES,
	JUEVES,
	VIERNES,
	SABADO,
	DOMINGO
}

// Usando propiedades y funciones de las enumeraciones
enum class DIAS2(val esFinSemana : Boolean = false) {
	DOMINGO(true),	// Esto hace override al valor por defecto
	LUNES,
	MARTES,
	MIERCOLES,
	JUEVES,
	VIERNES,
	SABADO(true);

	// Este es la definición de una función dentro de una enum	
	companion object {
		fun hoy(obj : DIAS2) : Boolean {
			// Regresa la comparación de los días del fin de semana, para modificar el valor por defecto
			return obj.name.compareTo("SABADO") == 0 || obj.name.compareTo("DOMINGO") == 0 
		}
	}
}

fun main() {
	// Ver la enumeración
	for(dia in DIAS.values()) {
		// Observar el valor constante y el nombre
		println("${dia.ordinal} - ${dia.name}")
	}
	// Ver un valor en particular
	println("${DIAS.valueOf("MIERCOLES")}")
	// Sin embargo intentar un valor que no exista
	//println("${DIAS.valueOf("MIERCOLE")}")
	
	println("------------------------------")
	// Utilizar el operador when
	when(DIAS.DOMINGO){
		DIAS.DOMINGO -> println("Hoy es domingo")
		DIAS.LUNES -> println("Hoy es lunes")
		DIAS.MARTES -> println("Hoy es martes")
		DIAS.MIERCOLES -> println("Hoy es miércoles")
		DIAS.JUEVES -> println("Hoy es jueves")
		DIAS.VIERNES -> println("Hoy es viernes")
		DIAS.SABADO -> println("Hoy es sábado")
		// No es posible poner una cláusula else ya que
		// lanza un warning
	}
	
	// Mostrar las propiedades y funciones de enum
	println("------------------------------")
	for(dia in DIAS2.values()) {
		println("${dia.ordinal} - ${dia.name} es fin de semana ${dia.esFinSemana}") 
	}
	val diaHoy = DIAS2.LUNES
	println("Será que hoy es fin de semana ${DIAS2.hoy(diaHoy)}")
}