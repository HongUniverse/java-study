package org.example.java;

import java.util.Scanner;

/*
① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
*/
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도 입력 : ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static String isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return "윤년";
        }else {
            return "평년";
        }
    }
}
