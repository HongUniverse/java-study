package org.example.java;

public class WhileTest {

    public static void main(String[] args) {
        int num = 65;
        String arr = "";
        while(num <= 90){
            arr += (char)num;
            if(arr.length() == 5){
                System.out.println(arr);
                arr = "";
            }
            num ++;
        }
        System.out.println(arr);

    }
}
