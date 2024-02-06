package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 자릿수 더하기
 *
 * 문제설명 :
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 0 ≤ n ≤ 1,000,000
 *
 * 입출력 예 :
 * n	   result
 * 1234	    10
 * 930211	16
 */
import java.util.Arrays;

public class Test6 {
    public int solution(int n) {
        //int to String
        String[] strArr = Integer.toString(n).split("");
        int sum = 0;
        for(String str : strArr){
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    public int otherSolution(int n){
        int answer = 0;

        while(n>0){
            answer += n%10;
            n /= 10;
        }
        return  answer;
    }

    public int otherSolution2(int n){
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
