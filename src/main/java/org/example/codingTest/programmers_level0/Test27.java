package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 짝수는 싫어요
 *
 * 문제설명 :
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 100
 *
 * 입출력 예 :
 * n	result
 * 10	[1, 3, 5, 7, 9]
 * 15	[1, 3, 5, 7, 9, 11, 13, 15]
 */
import java.util.*;
import java.util.stream.IntStream;

public class Test27 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i%2 != 0).toArray();
    }

    public int[] otherSolution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=1; i<= n; i++){
            if(i%2 != 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
