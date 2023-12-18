package algorithm.programmers.level2

class AlgorithmA {

}

fun main(){

    println(solution1(-4, 7, true)) // result 3
    println(solution2(-4, 7, false)) // result -11

}


fun solution1(a: Int, b: Int, flag: Boolean): Int {
    var answer: Int = 0;

    if (flag){
        answer = a + b;
    }else{
        answer = a - b;
    }

    return answer;

}

fun solution2(a: Int, b: Int, flag: Boolean): Int {
    var answer: Int = 0;

    return if (flag) a + b else a - b

}