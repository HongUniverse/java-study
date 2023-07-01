package org.example.java;

class Car{
    String color;
    String gearType;
    int door;
    /*
    this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
    모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
    this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
     */
    Car(){
        this("white", "auto", 4); //생성자의 이름으로 클래스이름 대신 this를 사용한다.
    }
    Car(String color) {
        this(color, "auto", 4); // 다른 생성자 호출시 빈드시 첫줄에서만 호출이 가능하다.
    }
    Car(String color, String gearType, int door){
        this.color = color; // 인스턴스 변수와 지역변수 구별하기 위해 this.을 붙여야한다. 안그러면 둘다 지역변수로 간주된다.
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        System.out.println(c1.color + " " + c1.gearType + " " + c1.door);
        System.out.println(c2.color + " " + c2.gearType + " " + c2.door);
    }
}
