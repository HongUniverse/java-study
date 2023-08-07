package org.example.programmers.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 문제이름 : 공백으로 구분하기 2
 *
 * 문제설명 :
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * my_string은 영소문자와 공백으로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
 * my_string에는 단어가 하나 이상 존재합니다.
 *
 * 입출력 예 :
 * my_string	result
 * " i    love  you"	["i", "love", "you"]
 * " programmers  "	["programmers"]
 */
public class Test79 {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        return list.toArray(String[]::new);
    }

    public String[] otherSolution(String my_string) {
        return my_string.trim().split("[ ]+");
    }

    public String[] otherSolution2(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
    }
}
