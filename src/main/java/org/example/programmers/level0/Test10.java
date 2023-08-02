package org.example.programmers.level0;

/**
 * 문제이름 : 최댓값 만들기(1)
 *
 * 문제설명 :
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 0 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers의 길이 ≤ 100
 *
 * 입출력 예 :
 * numbers	                   result
 * [1, 2, 3, 4, 5]	            20
 * [0, 31, 24, 10, 1, 9]	     744
 */
import java.util.*;

public class Test10 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num = numbers.length-1;
        return numbers[num]*numbers[num - 1];
    }
    //버블 정렬 이용
    public int otherSolution(int[] numbers){
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return answer;
    }
}
