// Función principal
fun main(args: Array<String>) {
	/* Condicionales
 	 * De manera similar a otros lenguajes de programación
 	 * Kotlin cuenta con operadores para implementar la lógica condicional
 	 * */
	var variable : Int = 5
	
	if (variable == 42) {
		println("Esa es la respuesta")
	} else if(variable > 35) {
		println("La respuesta está cercana")
	} else {
		println("Error en la matrix")
	}
	
	// Una forma de reducir esto último es mediante el uso de
	// declaraciones condicionales
	val respuesta: String = if (variable == 42) {
		"Esa es la respuesta"
	} else if(variable > 35) {
		"La respuesta está cercana"
	} else {
		"Error en la matrix"
	}
	println(respuesta)
	
	// A medida que aumenta la complejidad de las declaraciones condicionales
	// el uso de if - else if - else se torna complicado, es por ello que se
	// puede utilizar la instrucción when
	variable = 42
	val respuesta2 = when {
		variable == 42 -> "Esa es la respuesta"
		variable > 35 -> "La respuesta está cercana"
		else -> "Error en la matrix"
	}
	println(respuesta2)
}