package org.example.java;

import java.util.Scanner;

//달력 만들어 주세요. -> 연 월 일 받으면 해당 연 월 일의 요일을 출력
public class DayOfCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도 입력 : ");
        int year = sc.nextInt();
        System.out.println("월 입력 : ");
        int month = sc.nextInt();
        System.out.println("일 입력 : ");
        int day = sc.nextInt();
        System.out.println(dayOfWeek(year,month,day) + "요일");
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int countMonthDaysNum(int month, boolean isLeapYear){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return 30;
        }
    }

    public static int countDaysNum(int year, int month, int day){
        int answer = 0;
        //작년까지의 일수 더하기
        for(int i = 1; i < year; i ++){
            if(isLeapYear(i)){
                answer += 366;
            }else{
                answer += 365;
            }
        }
        for(int i =1; i < month; i++){
            answer += countMonthDaysNum(i,isLeapYear(year));
        }

        answer += day;
        return answer;
    }

    public static String dayOfWeek(int year, int month, int day){
        int num = countDaysNum(year, month, day);
        String[] arr  = {"일", "월", "화", "수", "목", "금", "토"};
        String answer = arr[num % 7 ];
        return answer;
    }
}
