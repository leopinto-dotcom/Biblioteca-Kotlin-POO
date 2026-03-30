package Acuarioo

open class libro (
    override var titulo: String,
    var  autor: String,
    var paginas: Int
): material(), AccionMaterial {

    override fun mostrarInfo() {
        println("Libro: $titulo, Autor: $autor, Paginas: $paginas")
    }

    override fun prestar() {
        println("El libro '$titulo' ha sido prestado")
    }
}
