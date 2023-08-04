package org.example.programmers.level0;

/**
 * 문제이름 : 문자열 뒤집기
 *
 * 문제설명 :
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항 :
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력 예 :
 * my_string	return
 * "jaron"	   "noraj"
 * "bread"	   "daerb"
 */
public class Test24 {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
    public String otherSolution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
