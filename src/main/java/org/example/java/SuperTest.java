package org.example.java;

/**
 * 조상 클래스로부터 상속받은 멤버도 자손 클래스 자신의 멤버이므로 super 대신 this를 사용할 수 있다.
 * this와 마찬가지로 super역시 static메서드에서는 사용할 수 없고, 인스턴스메서드에서만 사용할 수 있다.
 */
public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x= 10;
}

class Child extends Parent2 {
    // x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 값이 출력된다.
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
