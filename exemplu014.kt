/*
 * Clases abstractas
 * Se trata de clases de las cuales no se pueden instancias
 * A partir de esto se debe de recordar lo siguiente:
 * 1.- No se pueden generar objetos de clases abstractas
 * 2.- Todas las propiedades son no abstractas por lo que si se
 *     desea hacer override de los miembros en clases hijas, se
 *     requiere la palabra open
 * 3.- En cambio las funciones no lo requieren
 * 4.- Las funciones no tienen un cuerpo por lo que deben implementarse
 *     en la clase derivada
 *
 * Esto de las clases abstractas es como crear una "anotación"
 * que recuerda que debe definirse si o si en la implementación
 * de la clase en clases derivadas
 * */

// Clase abstracta
abstract class Empleado(val nombre : String, val experiencia : Int){
	// Propiedad abstracta, debe hacerse override en la clase derivada
	abstract var salario : Double
	
	// Función abstracta, debe hacerse override en la clase derivada
	abstract fun fechaNacimiento(fecha : String)
	
	// Función no abstracta
	fun detallesEmpleado() {
		println("Nombre del empleado: $nombre")
		println("Experiencia en años: $experiencia")
		println("Salario anual      : $salario")
	}
}
// Clase derivada
class Ingeniero(nombre : String, experiencia: Int) : Empleado(nombre, experiencia) {
	// Propiedad y...
	override var salario = 50000.0
	// ... función que deben de ser override
	override fun fechaNacimiento(fecha : String){
		println("Fecha de nacimiento: $fecha")
	}
}

// Puede crearse una clase abstracta con una función abstracta
abstract class Calculador {
	// Se crea la función abstracta
	abstract fun cal(x : Int, y : Int) : Int
}
// A partir de la anterior se crean las clases derivadas
class Suma : Calculador() {
	override fun cal(x : Int, y : Int) : Int {
		return x + y
	}
}
class Resta : Calculador() {
	override fun cal(x : Int, y : Int) : Int {
		return x - y
	}
}
class Multiplica : Calculador() {
	override fun cal(x : Int, y : Int) : Int {
		return x * y
	}
}

fun main() {
	// Instancias un objeto
	val eng = Ingeniero("Pattel", 2)
	eng.detallesEmpleado()
	eng.fechaNacimiento("14 de abril de 1492")
	
	// Instancias de objetos
	// Observar que provienen de una misma clase base
	// Pero se instancia de las clases derivadas
	var suma : Calculador = Suma()
	var resta : Calculador = Resta()
	var multiplica : Calculador = Multiplica()
	// Crear variables 
	var x1 = suma.cal(4, 6)
	var x2 = resta.cal(10, 6)
	var x3 = multiplica.cal(20, 6)
	
	println("Sumación      : $x1")
	println("Restación     : $x2")
	println("Multiplciación: $x3")
}