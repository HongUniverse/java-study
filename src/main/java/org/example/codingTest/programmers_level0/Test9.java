package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 문자 반복 출력하기
 *
 * 문제설명 :
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 2 ≤ my_string 길이 ≤ 5
 * 2 ≤ n ≤ 10
 * "my_string"은 영어 대소문자로 이루어져 있습니다.
 *
 * 입출력 예 :
 * my_string	n	  result
 * "hello"	    3	  "hhheeellllllooo"
 */
public class Test9 {
    public String solution(String my_string, int n) {
        String[] arr = my_string.split("");
        String answer = "";
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<n; j++){
                answer += arr[i];
            }
        }
        return answer;
    }

    public String otherSolution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}
