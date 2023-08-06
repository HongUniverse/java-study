package org.example.java;

import java.util.Map;
import java.util.Scanner;

/*
두점 사이의 거리 구하기
 */
public class PointLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();
        double res = pLength(x, y);
        System.out.printf("(0, 0) 부터 (%d, %d)까지의 거리는 %.2f 입니다.", x, y, res);
    }

    public static double pLength(int x, int y){
        return Math.hypot(x,y);
    }
}
