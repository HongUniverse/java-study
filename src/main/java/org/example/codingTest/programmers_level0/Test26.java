package org.example.codingTest.programmers_level0;

/**
 * 문제이름 : 옷가게 할인 받기
 *
 * 문제설명 :
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항 :
 * 10 ≤ price ≤ 1,000,000
 *      price는 10원 단위로(1의 자리가 0) 주어집니다.
 * 소수점 이하를 버린 정수를 return합니다.
 *
 * 입출력 예 :
 * price	result
 * 150,000	142,500
 * 580,000	464,000
 */
public class Test26 {
    //첫번째 풀이
    public int solution(int price) {
        switch(price/100000) {
            case 0:
                return price;
            case 1:
            case 2:
                return (int)(price * (1 - 0.05));
            case 3:
            case 4:
                return (int)(price * (1 - 0.1));
            default:
                return (int)(price * (1 - 0.2));
        }
    }
    //두번째 풀이
    public int myOtherSolution(int price) {
        int percent = price/100000;
        double num = percent >= 5 ? 20 : percent >=3 ? 10 : percent >=1 ? 5 : 0;
        return (int)(price*(1 - num/100));
    }
    //다른사람 풀이
    public int otherSolution(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}
