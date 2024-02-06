package org.example.codingTest.programmers_level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문제이름 : 문자열 정렬하기 (2)
 *
 * 문제설명 :
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 0 < my_string 길이 < 100
 *
 * 입출력 예 :
 * my_string	result
 * "Bcad"	"abcd"
 * "heLLo"	"ehllo"
 * "Python"	"hnopty"
 */
public class Test124 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(x->x.toLowerCase()).sorted().collect(Collectors.joining());
    }

    public String otehrSolution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        //return String.valueOf(c);
        return new String(c);
    }
}
