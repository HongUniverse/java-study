package org.example.codingTest.programmers_level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 첫 번째로 나오는 음수
 *
 * 문제설명 :
 * 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
 *
 * 제한사항 :
 * 5 ≤ num_list의 길이 ≤ 100
 * -10 ≤ num_list의 원소 ≤ 100
 *
 * 입출력 예 :
 * num_list	                    result
 * [12, 4, 15, 46, 38, -2, 15]	  5
 * [13, 22, 53, 24, 15, 6]	      -1
 */
public class Test33 {
    public int solution(int[] num_list) {
        int answer = -1;
        //거꾸로 배열의 마지막 음수를 저장하면 가장 첫번째 음수가 저장된다.
        for(int i=num_list.length-1; i>=0; i--){
            if(num_list[i] < 0){
                answer = i;
            }
        }
        return answer;
    }
    //다른 사람 풀이
    public int otherSolution(int[] num_list) {
        for (int i = 0;i < num_list.length;i++)
            if (num_list[i] < 0)
                return i;
        return -1;
    }
    //다른 사람 풀이
    public int otherSolution2(int[] num_list) {
        final int LENGHT = num_list.length;
        return IntStream.range(0, LENGHT).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    }

}
