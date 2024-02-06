package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 부분 문자열인지 확인하기
 *
 * 문제설명 :
 * 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만,
 * "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
 * 문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ target의 길이 ≤ 100
 * target은 영소문자로만 이루어져 있습니다.
 *
 * 입출력 예 :
 * my_string	target	result
 * "banana"	    "ana"	1
 * "banana"	   "wxyz"	0
 */
public class Test42 {
    public int solution(String my_string, String target) {
        return my_string.indexOf(target) > -1 ?  1  : 0;
    }

    public int otherSolution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}