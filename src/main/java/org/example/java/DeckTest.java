package org.example.java;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}
class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];
    //카드 초기화
    Deck(){
        int i = 0;
        for(int k=Card.KIND_MAX; k > 0; k--){
            for(int n=0; n<Card.NUM_MAX; n++){
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }
    Card pick(int index){
        return cardArr[index];
    }
    void shuffle(){
        //Math.random()의 범위 0.0 ~ 9.999999
        for(int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[r] = temp;
        }
    }
}

class Card{
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card(){
        this(SPADE, 1);
    }
    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }
    //toString()은 모든 클래스의 조상인 Object클래스에 정의된 것으로, 어떤 종류의 객체에 대해서도 toString()을 호출하는 것이 가능하다.
    public String toString(){
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQk";
        return "kind : " + kinds[this.kind] + ", number : " +numbers.charAt(this.number);
    }


}
