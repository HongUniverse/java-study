package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 숨어있는 숫자의 덧셈(1)
 *
 * 문제설명 :
 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
 *
 * 입출력 예 :
 * my_string	  result
 * "aAb1B2cC34oOp"	10
 * "1a2b3c4d123"	16
 *
 */
import java.util.*;
public class Test25 {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("")).mapToInt(Test25::isNumber).sum();
    }

    public static int isNumber(String s){
        try{
            return Integer.parseInt(s);
        }catch(NumberFormatException  e){
            return 0;
        }
    }

    public int otherSolution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");

        for(char ch : str.toCharArray()){
            answer += Character.getNumericValue(ch);
        }
        return answer;
    }

}
