package org.example.codingTest.programmers_level0;

import java.util.stream.Collectors;

/**
 * 문제이름 : l로 만들기
 *
 * 문제설명 :
 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
 * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * 입출력 예 :
 * myString	result
 * "abcdevwxyz"	"lllllvwxyz"
 * "jjnnllkkmm"	"llnnllllmm"
 */
public class Test83 {
    public String solution(String myString) {
        return myString.chars().mapToObj(x -> x <  108 ? "l" : Character.toString(x) ).collect(Collectors.joining());
    }
    public String otherSolution(String myString) {
        return myString.chars().mapToObj(x -> Character.toString(Integer.max(x, 'l'))).collect(Collectors.joining());
    }
    public String otherSolution2(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}
