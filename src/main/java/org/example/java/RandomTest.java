package org.example.java;

import java.util.*;
/*
1 ~ 9 사이의
5 * 5 형태의 숫자들을 출력하고,
전체 난수의 합,
전체 난수의 평균,
X의 합을 구하자.
*/
public class RandomTest {
    public static void main(String[] args) {
        randomTest();
        System.out.println();
        mathTest();
    }
    static void mathTest(){
        int sum = 0;
        int count = 0;
        int xsum = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int radomNum = (int)(Math.random() * (9-1+1) + 1);
                if((i==j)||(i+j==4)){
                    xsum += radomNum;
                }

                System.out.printf("%d ", radomNum);
                sum += radomNum;
                count ++;
            }
            System.out.println();
        }
        System.out.printf("난수의 합 : %d\n", sum);
        System.out.printf("난수의 평균 : %f\n", (double)sum/count);
        System.out.printf("난수 X 합 : %d", xsum);
    }

    static void randomTest(){
        int sum = 0;
        int count = 0;
        int xsum = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                Random rd = new Random();
                int radomNum = rd.nextInt(9) + 1;
                if((i==j)||(i+j==4)){
                    xsum += radomNum;
                }

                System.out.printf("%d ", radomNum);
                sum += radomNum;
                count ++;
            }
            System.out.println();
        }
        System.out.printf("난수의 합 : %d\n", sum);
        System.out.printf("난수의 평균 : %f\n", (double)sum/count);
        System.out.printf("난수 X 합 : %d", xsum);
    }
}
