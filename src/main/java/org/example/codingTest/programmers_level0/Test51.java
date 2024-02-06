package org.example.codingTest.programmers_level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제이름 : n개 간격의 원소들
 *
 * 문제설명 :
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 *
 * 입출력 예 :
 * num_list	            n	result
 * [4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
 * [4, 2, 6, 1, 7, 6]	4	[4, 7]
 */
public class Test51 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] otherSolution(int[] num_list, int n) {
        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int idx = 0;
        int[] answer = new int[N];
        for (int i = 0;i < num_list.length;i+=n)
            answer[idx++] = num_list[i];
        return answer;
    }
}
