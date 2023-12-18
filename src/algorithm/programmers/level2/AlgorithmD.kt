package algorithm.programmers.level2

import kotlin.math.ln

class AlgorithmD {
}
/*
* JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
*  단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다.
*  (첫 번째 입출력 예 참고)문자열 s가 주어졌을 때,
*  s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
*
* */
fun main(){

    println(solution("3people unFollowed me")) //return "3people Unfollowed Me"
//    println(solution("for the last week")) // "For The Last Week"
}

fun solution(s: String): String{

    return s.split(" ")
        .joinToString(" ") { it.toLowerCase().capitalize() }

//    val finalWords = s.split(" ")
//        .map { it.toLowerCase().replaceFirst(it[0], it[0].toUpperCase()) }
//
//    return finalWords.joinToString(" ")

//    val words = s.split(" ");
//    val targetWords = mutableListOf<String>()
//    val finalWords = mutableListOf<String>()
//
//    for (word in words){
//        targetWords.add(word.toLowerCase())
//    }
//    for (tw in targetWords){
//        finalWords.add(tw.replaceFirst(tw[0], tw[0].toUpperCase()))
//    }
//
//    return finalWords.joinToString(" ")

}