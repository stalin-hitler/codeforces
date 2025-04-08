import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var t = sc.nextInt()

    while (t-- > 0) {
        val n = sc.nextInt()
        val x = sc.nextInt()
        val y = sc.nextInt()
        val arr = LongArray(n)
        var total: Long = 0
        for (i in 0..<n) {
            arr[i] = sc.nextLong()
            total += arr[i]
        }
        var count = 0
        for(i in 0..<n){
            for (j in i + 1..<n) {
                val temp = (total - (arr[i] + arr[j]))
                if (temp in x..y) count++
            }
        }

        println(count)
    }
}

