package org.example.programmers.level0;

import java.util.Arrays;

/**
 * 문제이름 : 조건에 맞게 수열 변환하기 3
 *
 * 문제설명 :
 * 정수 배열 arr와 자연수 k가 주어집니다.
 * 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
 * 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ arr의 길이 ≤ 1,000,000
 * 1 ≤ arr의 원소의 값 ≤ 100
 * 1 ≤ k ≤ 100
 *
 * 입출력 예 :
 * arr	                    k	result
 * [1, 2, 3, 100, 99, 98]	3	[3, 6, 9, 300, 297, 294]
 * [1, 2, 3, 100, 99, 98]	2	[3, 4, 5, 102, 101, 100]
 */
public class Test50 {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(x -> k%2 == 0? x+k : x*k).toArray();
    }

    public int[] otherSolution(int[] arr, int k) {
        for(int i = 0; i < arr.length; i ++){
            if(k % 2 != 0){
                arr[i] *= k;
            }
            else{
                arr[i] += k;
            }
        }

        return arr;
    }
}
