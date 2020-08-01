/**
 * Excepciones
 * La programación puede presentar errores, de entre ellos se identifican dos principales:
 * 1.- Errores en tiempo de compilación, los cuales son aquellos que surgen cuando se
 *     hace un mal uso del lenguaje de programación, por ejemplo no se acatan las reglas
 *     de nombrar variables, errores de tipografía, signos faltantes como llaves o paréntesis
 * 2.- Errores en tiempo de ejecución, se trata de errores que el compilador no muestra como
 *     tal o si es muy común lo muestra como un "Warning"; estos son errores de lógica de
 *     programación, operaciones matemáticas que no pueden ser realizadas (divisiones entre 0)
 *     acceso a secciones inexistentes de arreglos o memoria.
 * Para estas últimas, los lenguajes de programaciones "más actuales" incorporan mecanismos para
 * tratar estos errores conocidos como excepciones, ya que están enfocadas a posibles errores que
 * aparecen en los algoritmos, pero que no pueden ser eliminados ya que eso consistiría en el cambio
 * del algoritmo y para evitar que el programa realice "cosas extrañas", se implementan estos
 *
 * La lista con las excepciones más comúnes:
 *  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/
 * */

// Crear una expresión try - catch para una función
fun test(a : Int, b : Int) : Any {
	return try {
		a/b
	}
	catch(e : Exception) {
		println(e)
		"La división entre cero no está permitida"
	}
}

// como crear excepciones personalizadas
fun pruebaPwd(passwort : String) {
	// Calcular la longitud de la contraseña y comparar
	if(passwort.length < 6)
		throw IllegalArgumentException("La contraseña es muy corta")
	else
		println("Contraseña válida")
}

// Función principal
fun main(args: Array<String>) {
	// Esto genera una excepción
	/*var num = 10 / 0
	println(num)*/
	
	// Por tanto se utiliza el bloque try - catch - finally
	try {
		var num = 10 / 0
	}
	// el bloque anterior genera una excepción de tipo artimética
	catch(e : ArithmeticException){
		// Se captura la excepción y se procesa que es lo que se va a hacer
		println("En esta casa obedecemos a las leyes de la aritmética, división entre 0 prohibida")
	}
	finally {
		println("Ese fue el ejemplo de try - catch - finally")
	}

	// Cuando se utilizan las expresiones de excepción en funciones
	var resultado1 = test(10,2)
	println("10 / 2 = " + resultado1)
	var resultado2 = test(10,0)
	println("10 / 0 = " + resultado2)

	// Probar la excepción lanzada
	pruebaPwd("co")
}