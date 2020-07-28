// Función principal
fun main(args: Array<String>) {
	/* Variables en Kotlin
 	 * Se utilizan dos palabras clave para declarar variables
 	 * * val: utilizada para variables cuyo valor no cambiará
 	 * * var: utilizada para variables cuyo valor puede modificarse
 	 * */
	// La variable cuenta es de tipo Int y se le asigna un valor de 10, el cual no podrá ser modificado
	val cuenta: Int = 10
	// si se intenta se mostrará un error
	// cuenta = 15
	
	// Caso contrario a var
	var cuenta2: Int = 15
	// Puede reasignarse el valor
	cuenta2 = 10
	
	// Existen varios tipos de datos a utilizar
	// Byte, Short, Long, Float, Double, String
	
	// Por otro lado, Kotlin puede inferir el tipo de dato al asignar un valor a la variable
	val lenguaje = "Kotlin"
	// Y de esta forma hacer uso de las funciones o métodos de dicha clase
	// (Kotlin es un lenguaje que soporta el paradigma Orientado a Objetos)
	val mayusculas = lenguaje.toUpperCase()
	
	// Un caso interesante del lenguaje Kotlin es que para asignar un valor
	// nulo a una variable, esta se debe de asignar como tipo anulable
	// colocando un "?" tras el tipo de dato
	val variableNula: String? = null
	// Es muy importante que el manejo de estas variables se haga con cuidado
	// pues puede ocasionar excepciones como NullPointerAssignment
	
	// Mostrar los valores en consola
	// Para mostrar las variables se usa "$" antes del nombre de la variable
	println("Los valores $cuenta y $cuenta2")
	println("El lenguaje $lenguaje en mayúsculas $mayusculas")
}