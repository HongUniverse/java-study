package org.example.java.polymorphism;

/**
 * 기본형 변수와 같이 참조변수도 형변환이 가능하다. 단, 서로 상속 관계에 있는 클래스 사이에서만 가능.
 * 자손타입 -> 조상타입(Up-casting) : 형변환 생략가능
 * 자손타임 <- 조상타입(Down-casting) : 형변환 생략불가
 * => 참조변수가 다룰 수 있는 멤버의 개수가 실제 인스턴스가 갖고 있는 멤버의 개수보다 적을 것이 분명할 때 형변환 생략가능 (자손타임 -> 조상타입)
 */
public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        // compile error - Car타입의 참조변수로는 water()를 호출할 수 없다.
        // car.water();

        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}