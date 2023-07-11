fun main(){
    val string = "casa"
    string.listMaker() // [c, a, s, a]
}

fun String.listMaker() {
    val lista = this.toList()
    println(lista)
}