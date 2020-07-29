/**
 * Funciones
 * Kotlin posee también un fuerte soporte para el tipo de programación funcional
 * */

// Las funciones son unidades de código que desarrollan una tarea en particular
// permiten "romper" o "partir" el código en módulos lo que lo vuelve más manejable

// Por ejemplo la siguiente función realiza la suma de 2 valores enteros y regresa un valor entero
// Se observa la estructura
// fun nombreFuncion(dato : tipoDato) : tipoDatoRetorno
fun sum(a: Int, b : Int) : Int {
	return a + b
}

// Es posible colocar argumentos por omisión
fun funciona(a : Int = 5, b : String = "Suecia") {
	println("El valor de a es: $a")
	println("Cuyo país es    : $b")
}

// Algo interesante de las funciones en Kotlin es que se pueden simplificar
// al máximo de la sigueinte forma
fun respuesta(valor : Int) : String = if(valor < 6) {
		"Reprobado"
	} else {
		"Aprobado"
}
// Indicando de manera implícita que el valor de retorno se obtiene de la expresión
// y así se omite la palabra return

// Otra característica que puede utilizarse en Kotlin es el uso de funciones anónimas
// En este caso la funcion funLongitudCadena, recibe una cadena
// y regresa un valor de tipo Int, el cual es la longitud de la cadena 
val funLongitudCadena : (String) -> Int = { input ->
	input.length
}
// Estas funciones pueden ser comparadas con las funciones lambda de otros lenguajes como Python

// También es posible hacerla un tanto más explícita
val funAnonima = fun(a : Int, b : Int) : Int {
	val mul = a * b
	return mul
}

// O también se puede observar lo siguiente
// anotando o apuntando los tipos
val suma1 = { a : Int, b : Int -> a + b }
// sin anotar los tipos de datos
val suma2 : (Int, Int) -> Int = { a, b -> a + b }

// Finalmente se tienen las funciones de orden superior
// Una función puede tomar otra como argumento, dichas funciones se les conoce
// como funciones de orden superior
// La siguiente es una función de orden superior
// La cual recibe una cadena, además de una función que toma una cadena y regresa un entero
fun mapeoCadena(cad : String, mapeador : (String) -> Int) : Int {
	// Función a invocar
	return mapeador(cad)
}

// Función principal
fun main(args: Array<String>) {
	// Asignar el valor de la función
	val valorSuma = sum(5, 4)
	println("Valor de la función: $valorSuma")
	
	// Existen algunas funciones contenidas en la librería estándar
	/**
	 * sqrt()		-	Calcular la raíz cuadrada
	 * rem()		-	Obtener el resto o residuo de la división de un par de números enteros
	 * compareTo()	-	Comparar dos números y regresar un valor booleano
	 * print()		-	Imprime un mensaje en consola
	 * readLine()	-	Utilizada para la entrada estándar
	 */
	print("Ingrese un valor: ")
	val valor = readLine()	// Ojo, esto regresará una cadena de texto
	println("El valor leído es: $valor")
	
	// Se manda a llamar las funciones con argumentos por omisión
	funciona(10, "Islandia")
	// O sin argumentos
	funciona()
	
	println()
	// Llamada a una función simplificada
	println("Tras mucho deliberar el resultado es: ${respuesta(8)}")
	
	println()
	// Para invocar funciones anónimas
	val longitud : Int = funLongitudCadena("Cadena laaaaarga")
	println("Longitud de la cadena $longitud")
	
	println()
	// Para invocar la función de orden superior
	val otro = mapeoCadena("Cadena de texto", { input -> input.length })
	println("Valor de la fn de orden superior: $otro")
}