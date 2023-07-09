package org.example.java;

/**
 * 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용하는 것이 좋다.
 * 특히 조상 클래스의 메서드를 자손 클래스에서 오버라이딩한 경우에 super를 사용한다.
 *
 */
public class SuperTest2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x= 10;
}

class Child2 extends Parent2 {
    int x = 20;
    // super.x는 조상클래스로부터 상속받은 멤버변수 x를 뜻하며, this.x는 자손 클래스에 선언된 멤버변수를 뜻한다.
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
