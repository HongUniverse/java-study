package org.example.java;

public class BlockTest {
    //클래스 초기화 블럭
    static{
        System.out.println("static { }");  //클래스 메모리가 처음 로딩될 때 한번만 수행된다.
    }

    {
        System.out.println("{ }");  //인스턴스를 생성할 때 마다 수행된다.
    }

    public BlockTest(){
        System.out.println("생성자");  // 생성자보다 인스턴스 초기화 블럭이 먼저 수행된다.
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }
}
