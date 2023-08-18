package org.example.programmers.level0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 문제이름 : 중복된 문자 제거
 *
 * 문제설명 :
 * 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ my_string ≤ 110
 * my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
 * 대문자와 소문자를 구분합니다.
 * 공백(" ")도 하나의 문자로 구분합니다.
 * 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
 *
 * 입출력 예 :
 * my_string	result
 * "people"	"peol"
 * "We are the world"	"We arthwold"
 */
public class Test127 {
    public String solution(String my_string) {
        String temp = "";
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            String s = my_string.charAt(i)+"";
            if(!temp.contains(s)) {
                answer += s;
            }
            temp += s;
        }
        return answer;
    }

    public String otherSolution(String my_string) {
        return my_string.chars().mapToObj(Character::toString).distinct().collect(Collectors.joining());
    }

    //HashSet 순서를 보장하지 않지만 LinkedHashSet은 순서대로 데이터를 정렬한다.
    public String otherSolution2(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        return String.join("", set);
    }
}
