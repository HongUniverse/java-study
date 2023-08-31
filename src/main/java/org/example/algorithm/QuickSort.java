package org.example.algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 7, 8, 3, 4};
        int left = 0;
        int right = arr.length -1 ;

        quickSort(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] array, int left, int right) {
        if(left >= right) return;

        // 분할
        int pivot = partition(array, left, right);

        // 피벗은 제외한 2개의 부분 배열을 대상으로 순환 호출
        quickSort(array, left, pivot-1);  // 정복(Conquer)
        quickSort(array, pivot+1, right); // 정복(Conquer)
    }
    public static int partition(int[] array, int left, int right) {
        /**
         // 최악의 경우, 개선 방법
         int mid = (left + right) / 2;
         swap(array, left, mid);
         */

        int pivot = array[left]; // 가장 왼쪽값을 피벗으로 설정
        int i = left, j = right;

        while(i < j) {
            while(pivot < array[j]) {
                j--;
            }
            while(i < j && pivot >= array[i]){
                i++;
            }
            swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;

        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
