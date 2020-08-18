/*
 * Interfaces
 * Las interfaces son tipos personalizados proporcionados por Kotlin
 * que no pueden ser instanciados de manera directa.
 * En lugar de eso, las interfaces definen una forma de comportamiento
 * que los tipos implementados deben de seguir.
 * Con la interfaz, es posible definir un grupo de propieades y métodos
 * que los tipos concretos deben seguir e implementar. Son como una especie
 * de plantillas de las plantillas (clases). 
 * */
interface Vehiculo {
	fun iniciar()
	fun detener()
}
// Clase que implementa la interfaz Vehículo
// algo similar a lo que sucede en la herencia
class Auto : Vehiculo {
	// Las clases de la interfaz vehículo deben de ser
	// override para poder implementarlas en la clase
	override fun iniciar() {
		println("El automóvil ha iniciado")
	}
	override fun detener() {
		println("El automóvil se ha detenido")
	}
}

// Interfaz que implementa valores y métodos por omisión
interface primeraInterfaz {
	// Esta función cuenta con un valor por defecto en b
	fun suma(a : Int, b : Int = 5)
	// Este es un método por defecto de la interfaz
	fun imprimir() {
		println("Este es un método por defecto")
	}
}
// Clase para implementar la interfaz
class demoInterfaz : primeraInterfaz {
	override fun suma(a : Int, b : Int) {
		val x = a + b
		println("La suma es $x")
	}
	override fun imprimir() {
		// Esto manda a llamar lo que se encuentra en la interfaz
		// (de manera similar a las clases base)
		super.imprimir()
		println("Ha sucedido override")
	}
}

// Interfaz con propieades
interface propieadesInterfaz {
	// Propiedades de la interfaz
	val a : Int
	val b : String
		get() = "Hola"	// Aquí implementa el método get de la propiedad
}
// Clase que implementa la interfaz
class demoPropiedades : propieadesInterfaz {
	override val a : Int = 5000
	// Sin embargo al hacer override...
	override val b : String = "Propiedad con override"
}

// Herencia entre interfaces
// Interfaz base
interface Dimensiones {
	val longitud : Double
	val amplitud : Double
}
// Interfaz extendida
interface calcularParametros : Dimensiones {
	fun area()
	fun perimetro()
}
// Clase que implementa la interfaz extendida
class XYZ : calcularParametros {
	override val longitud : Double
		get() = 10.0
	override val amplitud : Double
		get() = 15.0
	
	override fun area() {
		println("El area es: ${longitud * amplitud}")
	}
	override fun perimetro() {
		println("El perimetro es: ${2*(longitud + amplitud)}")
	}
}

fun main() {
	// Instanciar el objeto
	val obj = Auto()
	// Mostrar las funciones de la clase
	obj.iniciar()
	obj.detener()
	
	// Instanciar objeto
	val obj2 = demoInterfaz() 
	println(obj2.suma(3,2))
	// Enviar función con un solo valor
	println(obj2.suma(4))
	obj2.imprimir()
	
	// Instanciar objeto
	val obj3 = demoPropiedades()
	println(obj3.a)
	println(obj3.b)
	
	// Instanciar objeto
	val obj4 = XYZ()
	obj4.perimetro()
	obj4.area()
}