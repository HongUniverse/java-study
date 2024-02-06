package org.example.codingTest.programmers_level0;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문제이름 : 가장 큰 수 찾기
 *
 * 문제설명 :
 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array 원소 ≤ 1,000
 * array에 중복된 숫자는 없습니다.
 *
 * 입출력 예 :
 * array	result
 * [1, 8, 3]	[8, 1]
 * [9, 10, 11, 8]	[11, 2]
 */
public class Test103 {
    public int[] solution(int[] array) {
        int maxNum = IntStream.of(array).max().getAsInt();
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNum) {
                answer[0] = maxNum;
                answer[1] = i;
            }
        }
        return answer;
    }

    public int[] otherSolution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[]{max, index};
    }
}