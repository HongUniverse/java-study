package org.example.java;

/**
 * super()는 조상클래스의 생성자를 호출하는데 사용된다.
 * Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자, this() 또는 super()를 호출해야한다. 그렇지 않으면 컴파일러가 자동으로 첫줄에 삽입.
 * 어떤 클래스의 인스턴스를 생성하면, 클래스 상속관계의 최고조상이 Object 클래스까지 거슬러 올라가면서 모든 조상클래스의 생성자가 순서대로 호출된다는 것을 알 수 있다.
 */
public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }

}

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y){
        // 여기서 컴파일러가 super(); 를 삽입한다. Point의 조상인 Object클래스의 기본 생성자인 Object()를 의미한다.
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D(){
        this(100, 200, 300);
    }
    Point3D(int x, int y, int z) {
        super(x, y);    // 조상 클래스의 멤버변수는 이처럼 조상의 생성자에 의해 초기화되도록 해야한다.
        this.z = z;
    }
}
