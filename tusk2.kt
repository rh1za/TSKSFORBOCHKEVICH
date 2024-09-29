
fun main() {
//1
 val  a = 20
    val c = a / 10
    val b = a / 1
    val f = 2 + 0
    val g = 2 * 0
    println("$c\t$b\t$f\t$g")
//2
   val qq = 123
   val qw = qq / 1
   val ce = qq / 10
   val fw = 1 + 2 + 3
   val ge = 1 * 2 * 3
   println("$qw\t$ce\t$fw\t$ge")
//3
   val del = 50 / 5
   println(del)
//4
   val step = 2*2
   println(step)
//5
   val koren = 25 / 5
   println("Корень 25 = $koren")
//2.1
    val A = true
    val B = false
    val C = false
    println(A or B)
    println(A and B)
    println(C or B)
//2.2
    val X = false
    val Y = true
    val Z = false
    println(X or Z)
    println(X and Y)
    println(X and Z)
//2.3
    val Aa = true
    val Bb = false
    val Cc = false
    println(!Aa and Bb)
    println(Aa or !Bb)
    println(Aa and Bb or C)
//2.4
    val Xx = true
    val Yy = true
    val Zz = false
    println(!Xx and Yy)
    println(Xx or !Yy)
    println(Xx or Yy and Zz)
//2.6
    val Xxx = false
    val Yyy = false
    val Zzz = true
    println(Xxx or Yyy and !Zzz)
    println(Xxx and !Yyy or Zzz)
    println(!Xxx and !Yyy)
    println(Xxx and (!Yyy or Zzz))
    println(!(Xxx and Zzz)or Yyy)
    println(Xxx or (!(Yyy or Zzz)))
//2.7
    println(A or !(A and B) or C )
    println(!A or A and (B or C))
    println((A or B and !C) and C)
}

