/**
 * Instrucciones para ciclos
 * */
// Función principal
fun main(args: Array<String>) {
	// la instrucción for permite iterar sobre cualquier cosa que propocione un iterador, como en lenguaje C# (con el foreach) o Python
	// la sintaxis es:
	// for(item in coleccion)
	// Por ejemplo para iterar sobe un intervalo numérico
	for(i in 1..3) {  //1..3 se trata de una expresión range()
		println(i)
	}
	
	// O algo más avanzado
	for (i in 6 downTo 0 step 2) {
		println(i)
	}
	// que indica que se efectuará un conteo de 6 a 0, con pasos de 2
	
	// También se puede efectuar
	for(i in 1..8 step 2) {
		println(i)
	}
	
	// O si se desea recorrer un intervalo [a, b), esto es sin incluir a b
	for(i in 1 until 10) {
		println(i)
	}
	
	// Por otro lado, la otra instrucción que permite generar ciclos es "while" y "do-while"
	// Funcionando de la misma forma que en otros lenguajes de programación
	// La instrucción while(condición), pregunta si la condición es verdadera y luego ejecuta 
	var x : Int = 10
	while(x > 0) {
		println(x)
		x--
	}
	
	// Mientras que do-while() ejecuta y luego pregunta
	do {
		println(x)
		x++
	} while(x <= 10)
	// Observar con mucho cuidado el resultado de esta combinación
	
	// Además se soportan las instrucciones break y continue
	// break termina unc ciclo
	x = 0
	while(x < 10) {		
		if (x == 4) {
			break
		}
		println(x)
		x++
	}
	
	// mientras continue no ejecuta una sección de un ciclo
	x = 0
	while(x < 10) {		
		if (x == 4) {
			x++
			continue
		}
		println(x)
		x++
	}
}