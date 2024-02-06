package org.example.codingTest.programmers_level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 홀수 vs 짝수
 *
 * 문제설명 :
 * 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
 * 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
 *
 * 제한사항 :
 * 5 ≤ num_list의 길이 ≤ 50
 * -9 ≤ num_list의 원소 ≤ 9
 *
 * 입출력 예 :
 * num_list	            result
 * [4, 2, 6, 1, 7, 6]	 17
 * [-1, 2, 5, 6, 3]	      8
 */
public class Test86 {
    public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i<num_list.length; i++){
            if((i+1)%2 == 0){
                evenSum += num_list[i];
            }else{
                oddSum +=  num_list[i];
            }
        }
        return Integer.max(evenSum, oddSum);
    }

    public int otherSolution(int[] num_list) {
        return Integer.max(IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum(), IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum());
    }
}
