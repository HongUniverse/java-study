package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 문제이름 : 문자열 잘라서 정렬하기
 *
 * 문제설명 :
 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 *
 * 제한사항 :
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * 입출력 예 :
 * myString	result
 * "axbxcxdx"	["a","b","c","d"]
 * "dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]
 */
public class Test117 {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(st.nextToken().trim());
        }
        return list.stream().sorted().toArray(String[]::new);
    }

    public String[] solution2(String myString) {
        return Arrays.stream(myString.split("x")).filter(x -> !x.isEmpty()).sorted().toArray(String[]::new);
    }
}
