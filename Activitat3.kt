fun main() {
    println("Sumarem dos númreos, diguem el primer número: ")
    var num1:Int=readln().toInt()
    println("Diguem el segon número: ")
    var num2:Int=readln().toInt()
    println("La suma de $num1 més $num2 és: ${num1+num2}")
    println("Quina operació vols fer ara?")
    println(" - Per sumar escriu: 1")
    println(" - Per restar escriu: 2")
    println(" - Per multiplicar escriu: 3")
    println(" - Per dividir escriu: 4")
    var op2:Int=readln().toInt()
    println("Diguem el primer número: ")
    var num3:Int=readln().toInt()
    println("Diguem el segon número: ")
    var num4:Int=readln().toInt()
    if (op2==1){
        println("La suma de $num3 més $num4 és: ${num3+num4}")
    }
    if (op2==2){
        println("La resta de $num3 menys $num4 és: ${num3-num4}")
    }
    if (op2==3){
        println("La multiplicació de $num3 per $num4 és: ${num3*num4}")
    }
    if (op2==4){
        println("La divisió de $num3 entre $num4 és: ${num3/num4}")
    }
    println("Ara farem una altra operació, pots fer servir decimals, quina vols fer ara?")
    println(" - Per sumar escriu: 1")
    println(" - Per restar escriu: 2")
    println(" - Per multiplicar escriu: 3")
    println(" - Per dividir escriu: 4")
    var op:Int=readln().toInt()
    println("Diguem el primer número: ")
    var num5:Float=readln().toFloat()
    println("Diguem el segon número: ")
    var num6:Float=readln().toFloat()
    if (op==1){
        println("La suma de $num5 més $num6 és: ${num5+num6}")
    }
    if (op==2){
        println("La resta de $num5 menys $num6 és: ${num5-num6}")
    }
    if (op==3){
        println("La multiplicació de $num5 per $num6 és: ${num5*num6}")
    }
    if (op==4){
        println("La divisió de $num5 entre $num6 és: ${num5/num6}")
    }
}