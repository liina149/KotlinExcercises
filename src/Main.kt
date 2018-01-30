
fun main(args : Array<String>) {

    var nimi = "Liina"
    println("Hello $nimi")

    var i = 23
    var j = 36



    fun liida(i: Int, j: Int): Int = i+j

    print("$i + $j ${ liida(i,j) }")
}