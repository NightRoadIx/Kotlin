/**
 * Arreglos
 * */
// Importar el paquete de manejo de Arrays
import java.util.Arrays

// Función principal
fun main(args: Array<String>) {
	// Tratamiento de arreglos
	// Los arreglos en Kotlin se manejan como objetos
	// y por lo tanto se tienen funciones para su generación y manejo
	// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/
	
	// Generar un arreglo con la función arrayOf()
	val numeros = arrayOf(1, 2, 3, 4, 5)
	// Mostrar como una cadena de texto
	println(Arrays.toString(numeros))
	
	// Por supuesto se puede utilizar for para recorrer el arreglo
	for(i in numeros) {
		println(i)
	}
	
	// Otra forma de crear un arreglo es mediante los rangos de números
	val numeros2 = (3..12)
	for(i in numeros2) {
		println(i)
	}
	// sin embargo, aquí cabe aclarar que este arreglo no puede ser utilizado en Array.toString() directamente por cuestión de tipo de datos
	// para ello se tendría que usar las funciones
	println(Arrays.toString(numeros2.toList().toTypedArray()))
	// Puesto que lo generado por arrayOf() es un tipo Arrays (objeto o clase)
	
	// Por otra parte, existen tipos primitivos de arreglos, los cuales se generan
	// usando las funciones ByeArray(), ShortArray, IntArray...
	// los cuales también difieren del tipo Array y Arrays
	// sin embargo, varios métodos son iguales
	val arregloEntero = IntArray(5) // Esto genera un arreglo [0,0,0,0,0]
	println(Arrays.toString(arregloEntero))
	
	// Para iniciar a un valor en específico
	val arregloEntero2 = IntArray(5) { 42 }
	println(Arrays.toString(arregloEntero2))
	
	// Ahora haciendo uso de una función lambda
	// i inicia con un valor de 0 y ejecuta el número de veces indicado
	val arregloEntero3 = IntArray(5, { i -> i * 2 + 3 })
	println(Arrays.toString(arregloEntero3))
	
	// La indexación de los elementos del arreglo inicia desde [0]
	println("Elemento: " + arregloEntero3[0])
	
	// Se puede añadir elementos a un arreglo, sin embargo, los arreglos en Kotlin son estáticos
	// por lo que se debe crear un nuevo arreglo
	val arregloEntero3a = arregloEntero3.plus(13)
	println(Arrays.toString(arregloEntero3a))
	
	// Obtener el primer y último elemento del arreglo
	println(arregloEntero3a.first())
	println(arregloEntero3a.last())
	
	// contabilizar el número de elementos del arreglo
	println("Hay ${arregloEntero3a.count()} elementos en el arreglo")
	
	// Recorrer el arreglo con las funciones de la clase
	// En este caso recorre todo el arreglo tal como si fuera una función for
	arregloEntero3a.forEach({ e -> print("$e ") })
	println()
	// o utilizar los índices del arreglo
	arregloEntero3a.forEachIndexed({i, e -> println("arregloEntero3a[$i] = $e")})
	
	// Finalmente, se puede ordenar los areglos
	val nums = arrayOf(7, 3, 3, 4, 5, 9, 1)
	// orden ascendente
	val sortedNums = nums.sortedArray()
	println(Arrays.toString(sortedNums))
	
	// orden descendente
	val sortedNumsDesc = nums.sortedArrayDescending()
	println(Arrays.toString(sortedNumsDesc))
	
	
}