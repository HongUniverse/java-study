package org.example.codingTest.programmers_level0;

import java.util.Arrays;

/**
 * 문제이름 : 뒤에서 5등까지
 *
 * 문제설명 :
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 6 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 100
 *
 * 입출력 예 :
 * num_list	                     result
 * [12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 */
public class Test80 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list,0, 5);
    }

    public int[] otherSolution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}
