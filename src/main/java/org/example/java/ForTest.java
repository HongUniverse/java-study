package org.example.java;

public class ForTest {
    public static void main(String[] args) {
        ForTest test = new ForTest();
        test.prin01();
        System.out.println();
        test.prin02();
        System.out.println();
        test.prin03();
        System.out.println();
        test.prin04();
        System.out.println();
        test.prin05();
    }

    void prin01(){

        for(int i=1; i<=5; i++){
            String stars = "";
            char star = '★';
            for(int j=1; j<=i; j++){
                stars += star;
            }
            System.out.println(stars);
        }
    }
    void prin02(){
        for(int i=1; i<=5; i++){
            String stars = "";
            char star = '★';
            for(int j=5; j >=  i ; j--){
                stars += star;
            }
            System.out.println(stars);
        }
    }

    void prin03(){
        for(int i=1; i<=5; i++){
            String stars = "";
            char star = '★';
            for(int j=1; j<=i; j++){
                stars += star;
            }
            System.out.printf("%5s\n", stars);
        }
    }

    void prin04(){
        for(int i=1; i<=5; i++){
            String stars = "";
            char star = '★';
            for(int j=5; j >=  i ; j--){
                stars += star;
            }
            System.out.printf("%5s\n", stars);
        }
    }

    void prin05(){
        int sum = 0;
        for(int i=1; i <=5 ; i++){

            String stars = "";
            char star = '★';
            for(int j=5; j >=  i ; j--){
                stars += " ";
            }
            for(int j=0; j<=sum; j++){
                stars += star;
            }
            System.out.printf("%s\n",stars);
            sum += 2;
        }
    }
}

