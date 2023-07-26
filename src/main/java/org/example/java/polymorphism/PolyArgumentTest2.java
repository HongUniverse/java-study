package org.example.java.polymorphism;

/**
 * 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다.
 * Product p[] = new Product[3];
 * p[0] = new Tv();
 * p[1] = new Computer();
 * p[2] = new Audio();
 */
class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){return "Audio";}
}

class Buyer2 extends Buyer{
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i=0; i<item.length;i++){
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구매하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }


}
