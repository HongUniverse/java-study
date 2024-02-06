package org.example.codingTest.programmers_level0;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 * 문제이름 : 순서 바꾸기
 *
 * 문제설명 :
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이
 *
 * 입출력 예 :
 * num_list 	     n	result
 * [2, 1, 6]	     1	[1, 6, 2]
 * [5, 2, 1, 7, 5]	 3	[7, 5, 5, 2, 1]
 */
public class Test87 {
    public int[] solution(int[] num_list, int n) {
        int[] first = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] second = Arrays.stream(num_list).limit(n).toArray();
        return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
    }

    public int[] otherSolution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i<num_list.length; i++){
            if(n == num_list.length){
                n = 0;
            }
            answer[i] = num_list[n];
            n++;
        }
        return answer;
    }
    public int[] otherSolution2(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i+n) % num_list.length]).toArray();
    }
}
