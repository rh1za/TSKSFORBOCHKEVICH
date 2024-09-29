fun main(){
    var num = readln().toInt()
    var q = num / 1000
    var w = num / 100 % 10
    var e = num % 100 / 10
    var r = num % 100 % 10
    var a = readln().toInt()
    if(q + w == e + r) println("Cумма 1 равна 2")
    else println("не равны")
    if ((q + w + e + r) % 3 == 0) println("кратно 3")
    else println("не кратна 3")
    if ((q * w * e * r) % 4 == 0) println("кратно 4")
    else println("не кратно 4")
    if ((q * w * e * r) % a == 0) println("кратно $a")
    else println("не кратно $a")
}