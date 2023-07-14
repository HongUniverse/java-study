package org.example.java.polymorphism;

/**
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용한다.
 * FireEngine은 Object클래스와 Car클래스의 자손 클래스이므로, 조상의 멤버들을 상속받았다.
 * 어떤 타입에 대한 instanceof 연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
 */
public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine instance");
        }

        if(fe instanceof Car){
            System.out.println("This is a Car instance");
        }

        if(fe instanceof Object){
            System.out.println("This is and Object instance");
        }

        System.out.println(fe.getClass().getName());
    }
}
