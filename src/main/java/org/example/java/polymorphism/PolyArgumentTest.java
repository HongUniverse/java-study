package org.example.java.polymorphism;

class Product {
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv(){
        super(100);
    }
    public String toString(){return "Tv";}
}

class Computer extends Product {
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    //메서드의 매개변수로 Product클래스의 자손타입의 참조변수면 어느 것이나 매개변수로 받아들일 수 있다.
    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
