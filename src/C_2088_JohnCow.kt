import java.util.*
import java.util.stream.Collectors

fun main() {
    val sc = Scanner(System.`in`)
    var t = sc.nextInt()
    testCases@ while (t-- > 0) {
        val row = sc.nextInt()
        val col = sc.nextInt()

        val cards = Array(row) { IntArray(col) }

        for (i in 0..<row) for (j in 0..<col) cards[i][j] = sc.nextInt()

        for (i in cards) Arrays.sort(i)

        val que = PriorityQueue<List<Int?>> { a: List<Int?>, b: List<Int?> -> a.get(0)?.minus(b.get(0)!!) ?: 0 }
        for (i in 0..<row) {
            que.add(ArrayList(listOf(cards[i][0], i)))
        }
        val wording: MutableList<Int> = ArrayList()
        while (!que.isEmpty()) wording.add(que.poll()[1]?.plus(1) ?: 0)


        var topCard = -1
        for (i in 0..<col) {
            for (j in wording) {
                if (topCard > cards[j - 1][i]) {
                    println(-1)
                    continue@testCases
                }
                topCard = cards[j - 1][i]
            }
        }
        //System.out.println(wording);
        println(wording.stream().map { obj: Int -> obj.toString() }.collect(Collectors.joining(" ")))
    }
}

