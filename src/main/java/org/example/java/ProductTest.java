package org.example.java;

class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
}

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
        System.out.println("생산된 제품의 수는 모두" + Product.count + "개 입니다.");
    }
}
