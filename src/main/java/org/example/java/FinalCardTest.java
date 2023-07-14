package org.example.java;

/**
 * final이 붙은 변수는 상수이므로 일반적으로 선언과 동시에 초기화되지만, 생성자를 선언하여 각 인스턴스마다 final이 붙은 멤머변수가 다른 값을 갖도록 하는 것이 가능하다.
 */
class Card2{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    //매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화한다.
    Card2(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card2(){
        this("HEART", 1);
    }

    public String toString(){
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
        // 에러 Cannot assign a value to final variable NUMBER
        // c.NUMBER = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);

        Card2 c2 = new Card2();
        System.out.println(c2);

        Card2 c3 = new Card2("SPARE", 3);
        System.out.println(c3);

    }

}


