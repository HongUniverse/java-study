package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제이름 :  문자열 정렬하기 (1)
 *
 * 문제설명 :
 * 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 *
 * 제한사항 :
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
 * my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
 *
 * 입출력 예 :
 * my_string	result
 * "hi12392"	[1, 2, 2, 3, 9]
 * "p2o4i8gj2"	[2, 2, 4, 8]
 * "abcde0"	    [0]
 */
public class Test101 {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(Character ch : my_string.toCharArray()){
            if(Character.isDigit(ch)) list.add(Integer.parseInt(ch+""));
        }
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public int[] otherSolution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
