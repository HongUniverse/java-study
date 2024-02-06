package org.example.codingTest.programmers_level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 문제이름 : 약수 구하기
 *
 * 문제설명 :
 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 10,000
 *
 * 입출력 예 :
 * n	result
 * 24	[1, 2, 3, 4, 6, 8, 12, 24]
 * 29	[1, 29]
 */
public class Test115 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n%x == 0).toArray();
    }

    public int[] otehrSolution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
