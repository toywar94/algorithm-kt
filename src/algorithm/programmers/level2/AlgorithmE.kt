package algorithm.programmers.level2

import java.util.*

class AlgorithmE {

}
/* 해시

프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

입출력 예 #1
첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다.
하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.

따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.

* */

fun main(){

//    println(
//        solution(
//            intArrayOf(93, 30, 55),
//            intArrayOf(1, 30, 5)
//        )
//    )// return [2,1]
    println(
        solution(
            intArrayOf(95, 90, 99, 99, 80, 99),
            intArrayOf(1, 1, 1, 1, 1, 1)
        )
    )// return [1,3,2]

}


fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val queue: Queue<Int> = LinkedList()

    for (i in progresses.indices){
        val remainingProgress = 100 - progresses[i]
        val devLeftDay = remainingProgress / speeds[i] + if (remainingProgress % speeds[i] == 0) 0 else 1
        queue.add(devLeftDay);
    }
    println(queue)
    val result = mutableListOf<Int>()
    while (queue.isNotEmpty()){
        var cnt = 1
        val first = queue.poll()

        while (queue.isNotEmpty() && first >= queue.peek()){
            queue.remove()
            cnt++
        }
        result.add(cnt)

    }

    return result.toIntArray()
}
