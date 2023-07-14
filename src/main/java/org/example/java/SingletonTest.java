package org.example.java;

/**
 * - 생성자를 통해 직접 인스턴스를 생성하지 못하게 하고 public 메서드를 통해 인스턴스에 접근하게 함으로써 사용할 수 있는 인스턴스 개수를 제한할 수 있다.
 * - 클래스 앞에 final을 추가함으로써 상속할 수 없는 클래스라는 것을 알린다.
 */
final class Singleton {
    private static Singleton s = new Singleton();

    // 생성자의 접근 제어자를 private으로 지정하면, 외부에서 생성자에 접근할 수 없으므로 인스턴스를 생성할 수 없게 된다.
    private Singleton(){}

    // 외부에서 이 클래스의 인스턴스를 사용할 수 있도록 public인 동시에 static
    public static Singleton getInstance(){
        if(s == null) s = new Singleton();
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // 에러 - Singleton() has private access in Singleton
        // Singleton s =  new Singleton();
        Singleton s = Singleton.getInstance();
    }
}
