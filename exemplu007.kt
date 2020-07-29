/**
 * Programación Orientada a Objetos
 * Kotlin permite utilizar las propiedades del paradigma de POO
 * */

// Un ejemplo clásico de una clase
class persona {
	// Propiedades (o atributos)
	// Es importante hacer notar que las propieades se deben de iniciar
	var nombre : String = ""
	var edad : Int = 0
	var genero : Char = 'N'
	
	// Funciones miembro (o métodos)
	fun ingresarValores(n : String, a : Int, g : Char) {
		// Aquí se asignan los valores
		nombre = n
		edad = a
		genero = g
		println("Nombre: $nombre")
		println("Edad: $edad")
		println("Genero: $genero")
	}
	
	// Esta función modifica el nombre
	fun insertarNombre(n : String){
		// Observar el uso del operador this
		// el cual indica que se modifica el valor en esta clase
		this.nombre = n
	}
}

class Compania {
	// Getters y Setters
	// De la misma forma que en otros lenguajes con soporte de POO
	// Existen los conceptos de getters y setters, para poder obtener y modificar los valores
	// de los atributos de las clases
	var nombre : String = ""
		get() = field
		set(value) {
			field = value
		}
		// sin embargo se puede utilizar el modificador private para evitar que
		// se acceda de manera externa a escribir valores sobre la variable
		// private set
	
	// Para ingresar se requiere de una función
	//fun miFuncionInterna(n : String) {
	//	nombre = n
	//}
	
	// Lo interesante de los getters y setters en Kotlin es que permiten una mayor
	// flexibilidad que en otros lenguajes como C# o Java
}

// Constructor y getters y setters personalizados
// Un constructor en POO es aquella función que indica la forma en la que se
// generará un objeto a partir de la definción de la clase
// por lo general se crean funciones dentro de la clase con el mismo nombre
// y se van personalizando, además de contar con el constructor por defecto
// En Kotlin, esto se puede realizar de la siguiente manera
class Registro( correo : String, pwd : String, edad : Int, genero : Char) {
	var email_id : String = correo
		// getter personalizado
		get() {
			// en este caso, todo lo que se ingrese se asignará pero en minúsculas
			return field.toLowerCase()
		}
	var contrasena : String = pwd
		// set personalizado
		set(value) {
			// En caso de que el valor de la contraseña sea menor a 6, lanza una excepción
			field = if(value.length > 6) value else throw IllegalArgumentException("Contraseña muy pequeña")
		}
    var edad: Int = edad 
        // Custom Setter 
        set(value) { 
            field = if(value > 18) value else throw IllegalArgumentException("La edad debe de ser mayor a 18") 
        } 
    var genero : Char = genero 
        //Custom Setter 
        set (value){ 
            field = if(value == 'M') value else throw IllegalArgumentException("El usuario debe de ser del género M") 
        }  
}

// Función principal
fun main(args: Array<String>) {
	// Crear un objeto
	// El objeto es el elemento principal o básico de la POO
	// el cual se instancia a partir de la definición de una clase
	// y adquiere con ello todos sus atributos y métodos
	var obj = persona()
	
	// Crear otro objeto
	var obj2 = persona()
	
	// Hacer uso de una de las funciones de la clase persona
	obj.ingresarValores("Praveen", 50, 'M')
	
	obj2.insertarNombre("Alien")
	println("El nombre de la persona: ${obj2.nombre}")
	
	
	// Se instancia un objeto de la clase Compania
	val c = Compania()
	c.nombre = "NuevaCompañia"	// Aquí ingresa al setter
	// Con setter privado
	//c.miFuncionInterna("NuevaCompañia")
	println(c.nombre)			// Aquí ingresa al getter
	
	println()
	// Instanciar un objeto con un constructor personalizado
	val usuario = Registro("GateldeAngorel", "Koreanov", 25, 'M')
	// Revisar un dato
	println("Usuario: ${usuario.email_id}")
	
	// Generar una excepción
	usuario.contrasena = "abc"
}