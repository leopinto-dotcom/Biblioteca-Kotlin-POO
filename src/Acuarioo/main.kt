package Acuarioo

fun main() {
    val libro1 = libro("Kotlin Básico", "Juan Pérez", 200)
    libro1.mostrarInfo()
    libro1.prestar()

    println("------------")

    val revista1 = revista("Tech Hoy", 10)
    revista1.mostrarInfo()
    revista1.prestar()
}
