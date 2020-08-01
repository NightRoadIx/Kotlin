/**
 * Herencia
 * La herencia es uno de los principales conceptos de la POO
 * Esta permite la re-utilización de código, ya que posibilita el uso
 * de las propieades y métodos de una clase (clase base) a una nueva clase
 * (clase derivada), la cual puede contener sus propias propiedades y métodos
 * */

// Se debe usar la palabra clave open (permite que una clase pueda heredar)
open class claseBase {
	// propiedades
	val nombre = "Clase Base"
	
	// métodos
	fun A() {
		println("Esta es la clase base")
	}
}
// Ahora se genera la clase derivada usando :
class claseDerivada : claseBase() {
	// propiedades
	
	// métodos
	fun B() {
		// Imprimir la propiedad de la clase base
		println(nombre)
		println("Esta es la clase derivada")
	}
}

/* HERENCIA CON CONSTRUCTORES */
// Clase base
open class Empleado(nombre : String, edad : Int, salario : Int) {
	// Este es el bloque de inicio
	// Se ejecuta una vez que se manda a llamar al constructor
	init {
		println("Mi nombre es $nombre, tengo $edad años y percibo $salario al mes")
	}
}

// Clase derivada
class desarrolladorWeb(nombre : String, edad : Int, salario : Int) : Empleado(nombre, edad, salario) {
	fun sitioWeb() {
		println("Soy un desarrollador Web")
		println()
	}
}

// Clase derivada
class desarrolladorAndroid(nombre : String, edad : Int, salario : Int) : Empleado(nombre, edad, salario) {
	fun android() {
		println("Soy un desarrollador Android")
		println()
	}
}

/* Usando la superclase "super" */
open class Celular() {
	var color = "Plata"
	fun mostrarCompania(nombre : String) {
		println("Compañia: $nombre")
	}
}
//Clase derivada
class Ifone : Celular() {
	fun desplegarColor() {
		// Mandar a llamar a la propiedad de la clase base
		println("El color es: " + super.color)
		// Llamando a la función de la clase base
		super.mostrarCompania("Manzana")
	}
}

// Función principal
fun main(args: Array<String>) {
	// Instanciar la clase derivada
	val derivada = claseDerivada()
	
	// Se puede ingresar al método de la clase base
	derivada.A()
	// y al método de la clase derivada
	derivada.B()
	
	// Usando los constructores de clases derivadas
	val wd = desarrolladorWeb("YoMero", 25, 10000)
	wd.sitioWeb()
	val ad = desarrolladorAndroid("ElMeroMero", 24, 12000)
	ad.android()
	
	// Llamado con las superclases
	val p = Ifone()
	p.desplegarColor()
}