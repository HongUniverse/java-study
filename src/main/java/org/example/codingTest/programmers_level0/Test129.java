package org.example.codingTest.programmers_level0;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 문제이름 : 날짜 비교하기
 *
 * 문제설명 :
 * 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항 :
 * date1의 길이 = date2의 길이 = 3
 * 0 ≤ year ≤ 10,000
 * 1 ≤ month ≤ 12
 * day는 month에 따라 가능한 날짜로 주어집니다.
 *
 * 입출력 예 :
 * date1	             date2	  result
 * [2021, 12, 28]	[2021, 12, 29]	1
 * [1024, 10, 24]	[1024, 10, 24]	0
 */
public class Test129 {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i<3; i++){
            if(date1[i] < date2[i]){
                return 1;
            }
            if(date1[i] == date2[i]){
                continue;
            }
            if(date1[i] > date2[i]){
                return 0;
            }
        }
        return 0;
    }

    public int otherSolution1(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    public int otherSolution2(int[] date1, int[] date2) {

        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            return 1;
        } else {
            return 0;
        }
    }
}
