/**
 * Cadenas de texto
 * */

// Función principal
fun main(args: Array<String>) {
	// Las cadenas de caracteres no son otra cosa más que arreglos de caracteres
	// y como tales, se pueden tratar en Kotlin
	var cadena = "Holis!"
	
	println(cadena[0])
	
	// Recorrer toda la cadena
	// Se usa la propiedad de las cadenas (y arreglos en general) "indices" para operar
	// la variable "i" como el índice la cadena
	for(i in cadena.indices) {
		print(cadena[i] + " ")
	}
	
	println()
	// La propiedad length permite obtener la longitud de la cadena
	println(cadena.length)
	
	// Obtener un "pedazo" de la cadena, excluyendo el índice final
	println(cadena.subSequence(1, 4))
	
	// Comparar cadenas (regresa 0 si ambas cadenas son iguales)
	println(cadena.compareTo("Hola"))
	
	// Es posible utilizar secuencias de escape
	println("Esta cadena \n está \n rota")
	
	// O en otro caso utilizar cadenas "raw"
	var cadenaRaw = """Mi nombre
					|es
					|Bond
					|James Bond
	""".trimMargin()
	// trimMargin permite remover los espacios, usando como prefijo "|", sin embargo es posible pasar otro caracter como prefijo
	
	println(cadenaRaw)
}