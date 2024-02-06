package org.example.codingTest.programmers_level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제이름 : 정수 찾기
 *
 * 문제설명 :
 * 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 3 ≤ num_list의 길이 ≤ 100
 * 1 ≤ num_list의 원소 ≤ 100
 * 1 ≤ n ≤ 100
 *
 * 입출력 예:
 * num_list	         n	    result
 * [1, 2, 3, 4, 5]	 3	      1
 * [15, 98, 23, 2, 15]	20	  0
 */
public class Test49 {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).filter(x -> x == n).toArray().length > 0 ? 1 : 0;
    }

    public int otherSolution(int[] numList, int n) {
        /*
        allMatch() 모든 요소들이 매개값으로 주어진 조건을 만족하는지 조사
        anyMatch() 최소한 한 개의 요소가 주어진 조건에 만족하는지 조사
        noneMatch() 모든 요소들이 주어진 조건을 만족하지 않는지 조사
         */
        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
    }
}
