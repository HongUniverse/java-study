package org.example.programmers.level0;

import java.util.stream.IntStream;

/**
 * 문제이름 : 배열의 길이에 따라 다른 연산하기
 *
 * 문제설명 :
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
 * arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ arr의 길이 ≤ 1,000
 * 1 ≤ arr의 원소 ≤ 1,000
 * 1 ≤ n ≤ 1,000
 *
 * 입출력 예 :
 * arr	                     n	result
 * [49, 12, 100, 276, 33]	27	[76, 12, 127, 276, 60]
 * [444, 555, 666, 777]	   100	[444, 655, 666, 877]
 */
public class Test73 {
    public int[] solution(int[] arr, int n) {
        for(int i = 0; i< arr.length; i++){
            if(i%2 == 1 && arr.length%2 == 0){
                arr[i] += n;
            }
            if(i%2 == 0 && arr.length%2 == 1){
                arr[i] += n;
            }
        }
        return arr;
    }

    public int[] otherSolution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + ( i%2 == (arr.length %2 == 0 ?  1: 0)? 1: 0)).toArray();
    }

    public int[] otherSolution2(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
}
