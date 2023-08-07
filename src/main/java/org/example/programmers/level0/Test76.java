package org.example.programmers.level0;

/**
 * 문제이름 : 주사위 게임1
 *
 * 문제설명 :
 * 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
 *
 * a와 b가 모두 홀수라면 a^2 + b^2 점을 얻습니다.
 * a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
 * a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
 * 두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * a와 b는 1 이상 6 이하의 정수입니다.
 *
 * 입출력 예 :
 * a	b	result
 * 3	5	34
 * 6	1	14
 * 2	4	2
 */
public class Test76 {
    public int solution(int a, int b) {
        boolean flag1 = a%2 == 1;
        boolean flag2 = b%2 == 1;

        if(flag1 && flag2){
            return (int)(Math.pow(a, 2) + Math.pow(b, 2));
        }
        if(flag1 || flag2){
            return 2 * (a + b);
        }
        return Math.abs(a - b);
    }
}
