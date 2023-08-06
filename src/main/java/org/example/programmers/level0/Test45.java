package org.example.programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제이름 : 길이에 따른 연산
 *
 * 문제설명 :
 * 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 2 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * 입출력 예 :
 * num_list	                               result
 * [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
 * [2, 3, 4, 5]                         	120
 */
public class Test45 {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).reduce((x, y) -> num_list.length > 10 ? x + y : x * y).orElse(0);
    }
    public int otherSolution(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
    }
}
