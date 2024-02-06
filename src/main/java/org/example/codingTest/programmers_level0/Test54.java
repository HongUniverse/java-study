package org.example.codingTest.programmers_level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 배열 만들기1
 *
 * 문제설명 :
 * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 1,000,000
 * 1 ≤ k ≤ min(1,000, n)
 *
 * 입출력 예:
 * n	k	result
 * 10	3	[3, 6, 9]
 * 15	5	[5, 10, 15]
 */
public class Test54 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i =1; i<= n/k; i++){
            answer[i-1] = k*i;
        }
        return answer;
    }

    public int[] otherSolution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}
