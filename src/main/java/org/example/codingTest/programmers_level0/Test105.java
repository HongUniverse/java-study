package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 인덱스 바꾸기
 *
 * 문제설명 :
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 1 < my_string의 길이 < 100
 * 0 ≤ num1, num2 < my_string의 길이
 * my_string은 소문자로 이루어져 있습니다.
 * num1 ≠ num2
 *
 * 입출력 예 :
 * my_string	num1	num2	result
 * "hello"	1	2	"hlelo"
 * "I love you"	3	6	"I l veoyou"
 */
public class Test105 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            if(i == num1){
                answer += my_string.substring(num2, num2+1);
            }else if(i == num2){
                answer += my_string.substring(num1, num1+1);
            }else{
                answer += my_string.substring(i, i+1);
            }
        }
        return answer;
    }

    public String otherSolution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
        return answer;
    }
}
