package com.tripathy;

import java.util.Scanner;

class ConstructorUwu2 {
    String name;
    int n1;
    long l1;

    public ConstructorUwu2(String name) {
        this.name = name;
        System.out.println("String: "+name);
    }

    public ConstructorUwu2(String name, int n1){
        this.name= name;
        this.n1=n1;
        System.out.println("String and Integer: " + name+" "+n1 );

    }

    public ConstructorUwu2(long l1){
        this.l1 = l1;
        System.out.println("Long : " + l1);
    }

}

public class Constructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int y = sc.nextInt();
        long z = sc.nextLong();

        ConstructorUwu2 C1 = new ConstructorUwu2(x);
        ConstructorUwu2 C2 = new ConstructorUwu2(y);
        ConstructorUwu2 C3 = new ConstructorUwu2(z);


    }
}

