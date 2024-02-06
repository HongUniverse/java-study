package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 중복된 숫자 개수
 *
 * 문제설명 :
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 1,000
 * 0 ≤ n ≤ 1,000
 *
 * 입출력 예 :
 * array	              n	    result
 * [1, 1, 2, 3, 4, 5]	   1	2
 * [0, 2, 3, 4]	           1	0
 */
import java.util.*;

public class Test18 {
    public int solution(int[] array, int n) {

        return (int)Arrays.stream(array).filter(x -> x==n).count();
    }

    public int otherSolution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n) answer++;
        }
        return answer;
    }
}
