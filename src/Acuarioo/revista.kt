package Acuarioo

class revista (
    titulo: String,
    var edicion: Int
) : libro(titulo, "Autor desonocido", 50) {

    override fun mostrarInfo() {
        println("Revista: $titulo, Edicion: $edicion")
    }
}