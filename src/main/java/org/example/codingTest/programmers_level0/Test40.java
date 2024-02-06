package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 조건에 맞게 수열 변환하기1
 *
 * 문제설명 :
 * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ arr의 길이 ≤ 1,000,000
 *      1 ≤ arr의 원소의 값 ≤ 100
 *
 * 입출력 예 :
 * arr	                    result
 * [1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
 */
import java.util.*;
public class Test40 {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(Test40::myMethod).toArray();
    }

    public static int myMethod(int num){
        if(num >= 50 && num%2 ==0){
            return num/2;
        }
        if(num < 50 && num%2 != 0){
            return num*2;
        }
        return num;
    }

    public int[] otherSolution(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50&&arr[i]%2==0){
                arr[i] = arr[i]/2;
            }else if(arr[i]<50&&arr[i]%2==1){
                arr[i] = arr[i]*2;
            }
        }
        return arr;
    }
}
