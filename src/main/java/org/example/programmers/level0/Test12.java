package org.example.programmers.level0;

/**
 * 문제이름 : 문자열안에 문자열
 *
 * 문제설명 :
 * 문자열 str1, str2가 매개변수로 주어집니다.
 * str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ str1의 길이 ≤ 100
 * 1 ≤ str2의 길이 ≤ 100
 * 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
 *
 * 입출력 예 :
 * str1	                str2	result
 * "ab6CDE443fgh22iJKlmn1o"	"6CD"	1
 * "ppprrrogrammers"	"pppp"	2
 * "AbcAbcA"	"AAA"	2
 */
public class Test12 {
    public int solution(String str1, String str2) {

        return str1.contains(str2) ? 1 : 2;
    }
}
