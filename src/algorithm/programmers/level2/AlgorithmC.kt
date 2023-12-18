package algorithm.programmers.level2

class AlgorithmC {

}
/*

* */

fun main(){

    println(solution(
        arrayOf(
            intArrayOf(60, 50),
            intArrayOf(30, 70),
            intArrayOf(60, 30),
            intArrayOf(80, 40),
        )
    )) // result 4000


    println(solution(
        arrayOf(
            intArrayOf(10, 7),
            intArrayOf(12, 3),
            intArrayOf(8, 15),
            intArrayOf(14, 7),
            intArrayOf(5, 15),
            /*
            * 10 7
            * 12 3
            * 15 8
            * 14 7
            * 15 5
            * max(15) max(8) = 120
            * */
        )
    )) // result 120


}

// 가로 / 세로 ... 걍 제일 큰거 비교 하면 될 것 같은데.
fun solution(sizes: Array<IntArray>): Int {
    var answer: Int = 0
    var maxW: Int = 0 // 가로
    var maxH: Int = 0 // 세로

    for (size in sizes){
        val (w, h) = size[0] to size[1]
        print(w)
        println(h)
        maxW = maxOf(maxW, maxOf(w, h))
        maxH = maxOf(maxH, minOf(w, h))


    }

    return maxW * maxH
}
