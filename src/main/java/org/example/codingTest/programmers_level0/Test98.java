package org.example.codingTest.programmers_level0;

import java.util.Arrays;

/**
 * 문제이름 : 최댓값 만들기(2)
 *
 * 문제설명 :
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers 의 길이 ≤ 100
 *
 * 입출력 예 :
 * numbers	                 result
 * [1, 2, -3, 4, -5]	        15
 * [0, -31, 24, 10, 1, 9]	    240
 * [10, 20, 30, 5, 5, 20, 5]	600
 */
public class Test98 {
    public int solution(int[] numbers) {
        //최대값이 마이너스 일 수도 있기때문에 최소값 처리
        int maxNum= Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length ; j++){
                int num = numbers[i] * numbers[j];
                if( num> maxNum){
                    maxNum = numbers[i] * numbers[j];
                }
            }
        }
        return maxNum;
    }

    public int solution2(int[] numbers){
        Arrays.sort(numbers);
        int num = numbers.length;
        return Integer.max(numbers[num-1 ]*numbers[num - 2], numbers[0]*numbers[1]);
    }
}
