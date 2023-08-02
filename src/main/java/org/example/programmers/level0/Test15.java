package org.example.programmers.level0;

/**
 * 문제이름 : 짝수 홀수 개수
 *
 * 문제설명 :
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 1 ≤ num_list의 길이 ≤ 100
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예 :
 * num_list	           result
 * [1, 2, 3, 4, 5]	   [2, 3]
 * [1, 3, 5, 7]	       [0, 4]
 */
public class Test15 {
    public int[] solution(int[] num_list) {
        int evenNum = 0;
        int oddNum = 0;
        for(int num : num_list){
            if(num%2 == 0){
                evenNum ++;
            }else{
                oddNum ++;
            }
        }
        return new int[]{evenNum, oddNum};
    }
    public int[] otherSolution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
