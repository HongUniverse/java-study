package org.example.programmers.level0;

/**
 * 문제이름 : 특정 문자 제거하기
 *
 * 문제설명 :
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ my_string의 길이 ≤ 100
 * letter은 길이가 1인 영문자입니다.
 * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
 * 대문자와 소문자를 구분합니다.
 *
 * 입출력 예 :
 * my_string letter	result
 * "abcdef"	"f"	"abcde"
 * "BCBdbe"	"B"	"Cdbe"
 */
public class Test5 {
    public String solution(String my_string, String letter) {
        String[] strArr = my_string.split("");
        String result = "";
        for(String str : strArr){
            if(!str.equals(letter)) result += str;
        }
        return result;
    }

    public String otherSolution(String my_string, String letter){
        String answer = "";
        //replace([기존문자],[바꿀문자])
        answer = my_string.replace(letter, "");
        return answer;
    }
}
