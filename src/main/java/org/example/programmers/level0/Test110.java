package org.example.programmers.level0;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제이름 :간단한 식 계산하기
 *
 * 문제설명 :
 * 문자열 binomial이 매개변수로 주어집니다.
 * binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * 0 ≤ a, b ≤ 40,000
 * 0을 제외하고 a, b는 0으로 시작하지 않습니다.
 *
 * 입출력 예 :
 * binomial	        result
 * "43 + 12"	     55
 * "0 - 7777"	    -7777
 * "40000 * 40000"	1600000000
 */
public class Test110 {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial, "+/-/*", true);
        int num1 = Integer.parseInt(st.nextToken().trim());
        String seperator = st.nextToken();
        int num2 = Integer.parseInt(st.nextToken().trim());

        if(seperator.equals("+")){
            return num1 + num2;
        }else if(seperator.equals("-")){
            return num1 - num2;
        }
        return num1 * num2;
    }

    public int otherSolution(String binomial) {
        String[] cal = binomial.split(" ");

        if (cal[1].equals("+")) {
            return (Integer.parseInt(cal[0])) + (Integer.parseInt(cal[2]));
        } else if (cal[1].equals("-")) {
            return (Integer.parseInt(cal[0])) - (Integer.parseInt(cal[2]));
        } else {
            return (Integer.parseInt(cal[0])) * (Integer.parseInt(cal[2]));
        }
    }
}
