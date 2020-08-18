/**
 * Clases anidadas
 * Una clase declarada dentro de otra clase es llamda clase anidada.
 * Las clases anidadas son estáticas por lo que se pueden acceder a sus propieades y funciones
 * mediante el operador punto "." sin necesidad de crear objetos de la clase (esto es directo
 * con el nombre de la clase)
 * */

// Declaración de clase externa
class claseExterna {
	var str = "Clase externa"
	// Declarar la clase interna
	
	 // Si se define como clase "inner", ya es posible ingresar a
	// los valores de la clase externa en la anidada
	class claseAnidada {
		val nombre = "Clase interna"
		
		fun funcionAnidada(str2 : String) : String {
			// Se crea una variable que concatena la propiedad de la clase con el argumento
			var s2 = nombre.plus(str2)
			return s2
		}
	}
}

// Nueva clase externa
class claseSterna {
	var str = "Clase Esterna"
	
	// Clase interna con la referencia "innner" lo cual permite manejar destro de la clase
	// interna, las propiedades de la clase externa
	inner class claseDentro {
		var s1 = "Clase interna"
		
		fun funcionDentro() : String {
			// Se puede ingresar a la propiedad externa
			var s2 = str
			return s2
		}
	}
}

// Función principal
fun main(args: Array<String>) {
	// Ingresar a los miembros de la clase
	print(claseExterna().str)		// Se observa el uso de los ()
	print(" ")
	// El poder mandar a llamar la clase anidada es debido al tipo "static" de la clase externa
	print(claseExterna.claseAnidada().nombre)
	
	println("")
	
	// sin embargo también se puede crear un objeto de la clase anidada
	val anidado = claseExterna.claseAnidada()
	// Invocando a la función de la clase anidada
	var resultado = anidado.funcionAnidada(" cuya función es esta")
	// Se imprime el valor que regresa la función
	println(resultado)
	
	// Instanciar un objeto de las clases
	val nueva = claseSterna().claseDentro()
	println(nueva.funcionDentro())
}