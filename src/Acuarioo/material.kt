package Acuarioo

abstract class material {
    abstract val titulo: String
    abstract fun mostrarInfo()
}

interface AccionMaterial {
    fun prestar()
}
