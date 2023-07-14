package org.example.java.polymorphism;

/**
 * 서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있지만,
 * 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
 * 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다.
 */
public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        //car.drive();
        // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
        // ex) CaptionTv 가 Tv를 상속하고 있을 때 CaptionTv c = new Tv(); 컴파일 할시 에러. 실제 인스턴스인 Tv의 멤버 개수보다 참조변수 c가 사용할 수 있는 멤버변수가 더 많기 때문이다.
        /*
            fe = (FireEngine) car;
            fe.drive();
            car2 = fe;
            car2.drive();
         */

        //고친 코드
        Car car3 = new FireEngine();
        car3.drive();
        fe = (FireEngine) car3;
        fe.drive();
        car2 = fe;
        car2.drive();

    }
}
