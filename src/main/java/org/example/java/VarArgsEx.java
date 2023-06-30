package org.example.java;

public class VarArgsEx {
    //가변인자 테스트
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        //가변인자는 내부적으로 배열을 사용한다.
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("["+ concatenate("," ) + "]");


    }
    //가변인자를 사용한 메서드를 오버로딩하면, 구별되지 못하는 경우가 발생되기 쉬우므로, 오버로딩 사용하지 않는 것이 좋다.
    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }
}
