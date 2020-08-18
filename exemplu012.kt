/**
 * Herencia (2)
 * Cuando una clase derivada no contiene un constructor primario, se tiene que mandar a llamar el
 * constructor secundario de la clase derivada utilizando la palabra clave "super".
 *
 * Por otro lado, existe otro concepto conocido como sobrecarga de funciones, lo cual permite
 * de una clase hija o derivada que hereda de una clase padre o base, sustituir la funcionalidad
 * d eun método o función 
 * */

// Clase base o padre
open class Empleado {
	// Este es un constructor secundario, ya que no fue establecido al definir la clase
	constructor(nombre : String, edad : Int) {
		println("Se genera un objeto con el nombre $nombre")
		println("y edad $edad")
	}
}

// Clase derivada
class CEO : Empleado {
	// Este es el constructor secundario que debe utilizar el constrcutor de la clase padre
	constructor(nombre : String, edad : Int, salario : Double) : super(nombre, edad) {
		println("Percibe un salario de $salario")
	}
}

// Sobrecarga de funciones (function overriding)
// Clase base
open class Animal {
	// Las funciones que van a ser sobrecargadas llevan la palabra open
	open fun  correr() {
		println("Los animales pueden correr")
	}
}

// Clase derivada
class Guepardo : Animal() {
	// Se sobrecarga la función
	override fun correr() {
		println("El guepardo corre realmente rápido");
	}
}

// Función principal
fun main(args: Array<String>) {
	// Aquí se manda a llamar el constructor
	CEO("Nombre empleado",48,250.00)
	
	// Se instancia un objeto
	val t = Guepardo()
	// Se manda a llamar la función en override
	t.correr()
	
}