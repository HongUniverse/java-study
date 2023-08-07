package org.example.programmers.level0;

import java.util.Scanner;

/**
 * 문제이름 : 홀짝 구분하기
 *
 * 문제설명 :
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 *
 * 제한사항 :
 * 1 ≤ n ≤ 1,000
 *
 * 입출력 예 :
 * 입력 #1
 *
 * 100
 * 출력 #1
 *
 * 100 is even
 */
public class Test74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n%2 == 0 ? "even" : "odd";
        System.out.printf("%d is %s", n, s);
    }
}
