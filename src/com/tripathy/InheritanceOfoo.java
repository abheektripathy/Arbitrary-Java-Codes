package com.tripathy;

import java.util.Scanner;

public class InheritanceOfoo {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String x = SC.nextLine();
        String y = SC.nextLine();
        String z = SC.nextLine();

        Cow c1 = new Cow();
        c1.eat(x);

        Animal A1 = new Animal();

    }



}

class Animal{

    public Animal(){

    }



}

class Cow extends Animal{
    String Cowfood;



    public void eat(String cowfood){
        System.out.println("Cow is eating..."+Cowfood);
    }


}

class Dog extends Animal{
    String Dogfood;


    public void eat(String Dogfood){
        System.out.println("Dog is eating..."+Dogfood);

    }

}

class Lion extends Animal{
    String Lionfood;


    public void eat(String Lionfood){
        System.out.println("lion is eating..."+Lionfood);

    }
}
