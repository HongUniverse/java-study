package org.example.codingTest.programmers_level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 문제이름 : 콜라츠 수열 만들기
 *
 * 문제설명 :
 * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
 * 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
 * 계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
 * 임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 1,000
 *
 * 입출력 예 :
 * n	result
 * 10	[10, 5, 16, 8, 4, 2, 1]
 */
public class Test111 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(List.of(n));

        while (n != 1){
            if(n%2 == 0 ){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
            list.add(n);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //iterate 첫번째 인자는 초기 값이고, 두번째 인자는 종료 조건을 나타내는 람다 함수, 세번째 인자는 값이 어떻게 변경될지를 나타내는 람다 함수입니다.
    public int[] otherSolution(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i>1 , i-> i%2 ==0 ? i/2 : i*3 +1),
                        IntStream.of(1))
                .toArray();
    }
}
