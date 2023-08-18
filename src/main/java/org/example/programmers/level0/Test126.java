package org.example.programmers.level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 합성수 찾기
 *
 * 문제설명 :
 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 100
 *
 * 입출력 예 :
 * n	result
 * 10	5
 * 15	8
 */
public class Test126 {
    public int solution(int n) {
        int answer = 0;
       for(int i = 1; i<=n; i++){
           int count = 0;
           for(int j=1; j<=i; j++){
               if(i%j == 0 ) count++;
           }
           if(count >=3) answer++;
       }
       return answer;
    }
    public int otehrSolution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}
