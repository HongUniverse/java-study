package org.example.programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제이름 : 숫자 찾기
 *
 * 문제설명 :
 * 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 0 < num < 1,000,000
 * 0 ≤ k < 10
 * num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
 *
 * 입출력 예 :
 * num	    k	result
 * 29183	1	3
 * 232443	4	4
 * 123456	7	-1
 */
public class Test120 {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        return IntStream.rangeClosed(1, numStr.length()).filter(x-> Integer.parseInt(numStr.charAt(x-1)+"") == k).findFirst().orElse(-1);
    }
    //"-"을 추가해서 인덱스를 1부터 카운트
    public int otherSolution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }

    public int otherSolution2(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        answer = str.indexOf(String.valueOf(k));
        if (answer < 0) {
            return answer;
        } else {
            return answer + 1;
        }
    }
}
