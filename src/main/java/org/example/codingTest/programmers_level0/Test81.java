package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 홀짝에 따라 다른 값 반환하기
 *
 * 문제설명 :
 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 100
 *
 * 입출력 예 :
 * n	result
 * 7	16
 * 10	220
 */
public class Test81 {
    public int solution(int n) {
        int answer = 0;
        for(int i = n%2 ; i<= n; i += 2){
            answer += i%2 == 0? i*i : i;
        }
        return answer;
    }

    public int otherSolution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}
