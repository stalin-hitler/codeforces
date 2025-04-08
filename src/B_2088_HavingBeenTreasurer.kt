import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    var t = sc.nextInt()

    while (t-- > 0) {
        val n = sc.nextInt()
        val s = sc.next()

        var hcount = 0
        var ucount = 0
        for (ch in s.toCharArray()) {
            if (ch == '-') hcount++
            else if(ch=='_') ucount++
        }
        var answer: Long = 0

        if (hcount >= 2 && ucount >= 1) {
            val first = hcount / 2
            val last = hcount - first
            answer = first.toLong() * last.toLong() * ucount.toLong()

        }
        println(answer)
    }
}
