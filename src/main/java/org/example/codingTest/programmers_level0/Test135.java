package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 팩토리얼
 *
 * 문제설명 :
 * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
 * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
 * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 * i! ≤ n
 *
 * 제한사항 :
 * 0 < n ≤ 3,628,800
 *
 * 입출력 예 :
 * n	result
 * 3628800	10
 * 7	3
 */
public class Test135 {
    public int solution(int n) {
        int result = 1;
        while(getFactorial(result) <= n){
            result ++;
        }
        return result -1;
    }
    public static int getFactorial(int num){
        if(num<= 1){
            return num;

        }else{
            return getFactorial(num-1) * num;
        }
    }

    public int otehrSolution(int n) {
        int fac = 1;
        int i = 0;
        while(true){
            if(fac <=n){
                fac *= i + 1;
                i++;
            }else{
                break;
            }
        }
        return i -1;
    }
}
