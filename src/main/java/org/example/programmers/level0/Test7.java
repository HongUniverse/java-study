package org.example.programmers.level0;

/**
 * 문제이름 : 배열 뒤집기
 *
 * 문제설명 :
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ num_list의 길이 ≤ 1,000
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예 :
 * [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 */
import java.util.*;
import java.util.stream.Collectors;

public class Test7 {
    public int[] solution(int[] num_list) {
        int[] newArr = new int[num_list.length];
        for(int i= 0; i < num_list.length ; i++){
            newArr[i] = num_list[num_list.length -1- i];
        }
        return newArr;
    }

    public int[] otherSolution(int[] num_list){
        //boxed() : intStream 같이 원시 타입에 대한 스트림 자원을 클래스 타입(intStream -> Stream<Integer>)으로 전환하여 전용으로 실행 가능한 기능을 수행하기 위해 존재
        //int 자체로는 Collection에 못 담기 때문에 Integer클래스로 변환하여 List<Integer>로 담기 위함이다.
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
