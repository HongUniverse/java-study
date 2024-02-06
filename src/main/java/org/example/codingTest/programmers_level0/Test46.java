package org.example.codingTest.programmers_level0;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


/**
 * 문제이름 : 카운트 다운
 *
 * 문제설명 :
 * 정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 0 ≤ end ≤ start ≤ 50
 *
 * 입출력 예 :
 * start	end	result
 * 10	     3	[10, 9, 8, 7, 6, 5, 4, 3]
 */
public class Test46 {
    public int[] solution(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for(int i = start; i >=end; i--){
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] otherSolution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}
