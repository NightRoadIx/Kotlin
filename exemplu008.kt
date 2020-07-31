/**
 * Modificadores de clase
 * Los modificadores de clase son utilizados para restringir el acceso de
 * las clases, objetos, constructores, funciones, propieades a un cierto nivel
 *
 * Modificador		-		Descripción
 * public			-		Visible en todos lados (default)
 * private			-		Visible solo dentro de la misma clase solamente
 * internal			-		Visible dentro del mismo módulo (~)
 * protected 		-		Visible dentro de la misma clase y subclases
 
 ~ internal es un añadido a otros lenguajes de POO, e indica que solo
   es posible usar lo que este modificando dentro del programa escrito
   no en otro código fuente de un mismo sistema por ejemplo
 * */

// Clase privada
private class A {
	// Propiedad privada
	private val entero = 10
	fun display() {
		// Solo aquí se puede ingresar a la propiedad de la clase
		println(entero)
		println("Ingresando a entero de manera exitosa")
	}
}

// Clase base
open class B {
	// Valor protegido
	protected val entero = 10
}

// Clase derivada (Esto es herencia)
class C : B() {
	// La función de la clase C
	fun getValor() : Int {
		// Dado que se hereda de la clase B, se heredan todas las propieades
		// y métodos públicos, internos y protegidos
		return entero
	}
}

// Función principal
fun main(args: Array<String>) {

	// Instanciando la clase 
	var a = A()
	// Se puede ingresar a la función de la clase que es pública
	a.display()
	// Esto es imposible de realizar, aquí no se puede ingresar a las propiedades
	// println(a.entero)
	
	// Instanciando la clase
	var c = C()
	println("El valor del entero es: " + c.getValor() )
}