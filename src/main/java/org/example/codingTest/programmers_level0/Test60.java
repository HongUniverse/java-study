package org.example.codingTest.programmers_level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 카운트 업
 *
 * 문제설명 :
 * 정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 0 ≤ start ≤ end ≤ 50
 *
 * 입출력 예 :
 * start	end	result
 * 3	    10	[3, 4, 5, 6, 7, 8, 9, 10]
 */
public class Test60 {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for(int i = 0; i< answer.length ; i++){
            answer[i] = start++;
        }
        return answer;
    }

    public int[] otehrSolution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}
