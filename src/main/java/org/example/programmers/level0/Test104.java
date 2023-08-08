package org.example.programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 문제이름 : 배열 회전시키기
 *
 * 문제설명 :
 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 3 ≤ numbers의 길이 ≤ 20
 * direction은 "left" 와 "right" 둘 중 하나입니다.
 *
 * 입출력 예 :
 * numbers	                   direction	result
 * [1, 2, 3]	                "right"	[3, 1, 2]
 * [4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]
 */
public class Test104 {
    public int[] solution(int[] numbers, String direction) {
       int[] arr = new int[numbers.length];
       if(direction.equals("left")){
           int tmp = numbers[0];
           for(int i = 0; i < numbers.length - 1; i++){
               arr[i] = numbers[i + 1];
           }
           arr[numbers.length - 1] = tmp;
       }else{
           int tmp = numbers[numbers.length - 1];
           for(int i = 1; i < numbers.length; i++){
               arr[i] = numbers[i - 1];
           }
           arr[0] = tmp;
       }
       return arr;
    }

    public int[] otherSolution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if(direction.equals("right")){
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }else{
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
