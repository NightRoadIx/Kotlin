/*
 * Expresiones regulares
 * Las expresiones regulares son una parte fundamental de (casi)
 * cualquier lenguaje de programación.
 * El soporte de las expresiones regulares es proporcionado por
 * la clase "Regex". Un objeto de esta clase representa una expresión
 * regular que puede ser utilizada con propósitos de comparación
 * de cadenas (igualdades, subcadenas, etc)
 *
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-regex/
 * */

fun main() {
	// Instanciar un objeto para hallar todas las cadenas que
	// inicien con "a"
	val patron = Regex("^a")
	println(patron.containsMatchIn("abc"))
	println(patron.containsMatchIn("bac"))
	
	// Para hallar la ocurrencia de "ll" en una cadena
	val patron1 = Regex("ll")
	// Hallar el patron "ll" a partir del índice 5
	val res : MatchResult? = patron1.find("HaloHalo", 5)
	// Hay que mostrarlo como una variable nullable
	println(res ?.value)
	
	// Para hallar un patrón de 3 letras que inicien con ab
	val patron2 = Regex("ab.")
	// Revisar las posibles ocurrencias desde el índice 0
	val res1 : Sequence<MatchResult> = patron2.findAll("abcfffgdbabs", 0)
	// Recorrer las ocurrencias encontradas
	res1.forEach() {
		matchResult -> println(matchResult.value)
	}
	println()
	
	// Para hallar un patrón de cadena de texto
	val patron3 = Regex("h([oo]+)la")
	println(patron3.matches("hoola"))
	println(patron3.matches("hooooooooooooola"))
	println(patron3.matches("hoolayhoola"))
	println()
	
	// Para reemplazar un patrón de texto en una cadena
	val patron4 = Regex("xyz")
	// Reemplazar todas las "xyz" con "abc"
	println(patron4.replace("xyzxyzzzzzzzzz", "abc"))
	// Reemplazar solamente la primera ocurrencia de "xyz" por "abc"
	println(patron4.replaceFirst("xyzxyzzzzzzzzz", "abc"))
	println()
	
	// Separar una cadena de texto
	val patron5 = Regex("\\s+")	// patrón de espacios en blanco
	val res2 : List<String> = patron5.split("Esta es una oración")
	res2.forEach { word -> println(word) }
}