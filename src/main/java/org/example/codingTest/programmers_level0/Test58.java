package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 문자열로 변환
 *
 * 문제설명 :
 * 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 10000
 *
 * 입출력 예 :
 * n	result
 * 123	"123"
 * 2573	"2573"
 */
public class Test58 {
    public String solution(int n) {
       return String.valueOf(n);
    }

    public String otehrSolution(int n) {
        String answer = ""+n;
        return answer;
    }
}
