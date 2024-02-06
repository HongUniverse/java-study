package org.example.codingTest.programmers_level0;

import java.util.Arrays;

/**
 * 문제이름 : 원소들의 곱과 합
 *
 * 문제설명 :
 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * 입출력 예 :
 * num_list      	result
 * [3, 4, 5, 2, 1]	 1
 * [5, 7, 8, 3]	     0
 */
public class Test48 {
    public int solution(int[] num_list) {
        int num1 = Arrays.stream(num_list).reduce((x, y) -> x * y).orElse(0);
        double num2 = Math.pow(Arrays.stream(num_list).sum(), 2);
        return num1 < num2 ? 1 : 0;
    }
}
