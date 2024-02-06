package org.example.codingTest.programmers_level0;

import java.util.Arrays;

/**
 * 문제이름 : 문자열 정수의 합
 *
 * 문제설명 :
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 3 ≤ num_str ≤ 100
 *
 * 입출력 예 :
 * num_str	   result
 * "123456789"	45
 * "1000000"	1
 */
public class Test66 {
    public int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }

    public int otherSolution(String num_str) {
        return num_str.chars().map(c-> c-48).sum();
    }
}
