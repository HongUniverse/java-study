package org.example.java;

class Tv{
    boolean power;
    int channel;

    void power()    { power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){ --channel;}
}

// 자동적으로 조상 클래스의 멤버변수가 추가된다.
// 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래싀 멤버가 합쳐진 하나의 인스턴스로 생성된다.
class CpationTv extends Tv{
    boolean caption;
    void displayCpation(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

public class CpationTvTest {
    public static void main(String[] args) {
        CpationTv ctv = new CpationTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCpation("Hello World");  // caption이 false 이므로 출력되지 않음.
        ctv.caption = true;
        ctv.displayCpation("Hello World");  // caption이 false 이므로 출력되지 않음.

    }


}
