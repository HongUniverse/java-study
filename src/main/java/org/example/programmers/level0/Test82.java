package org.example.programmers.level0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제이름 : 배열 비교하기
 *
 * 문제설명 :
 * 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
 *
 * 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
 * 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
 * 두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항 :
 * 1 ≤ arr1의 길이 ≤ 100
 * 1 ≤ arr2의 길이 ≤ 100
 * 1 ≤ arr1의 원소 ≤ 100
 * 1 ≤ arr2의 원소 ≤ 100
 * 문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 다를 수 있는 점에 유의해주세요.
 *
 * 입출력 예 :
 * arr1    	arr2	result
 * [49, 13]	[70, 11, 2]	-1
 * [100, 17, 84, 1]	[55, 12, 65, 36]	1
 * [1, 2, 3, 4, 5]	[3, 3, 3, 3, 3]	0
 */
public class Test82 {
    public int solution(int[] arr1, int[] arr2) {
       boolean flag = arr1.length == arr2.length;
       if(flag){
           return compareTwoNum(Arrays.stream(arr1).sum(),Arrays.stream(arr2).sum());
       }else{
           return compareTwoNum(arr1.length, arr2.length);
       }
    }

    public int compareTwoNum(int num1, int num2){
        return num1 > num2 ? 1 : num2 > num1 ? -1 : 0;
    }

    public int otherSolution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0){
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;
    }
}
