package com.tripathy;

class Person{
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("oof");
    }

    public Person(String NewName) {
        this();
        name = NewName;


    }

    void walk(int steps) {
        System.out.println("bleh"+ steps );
        System.out.println(name);
    }

}

class Dev extends Person{

    public Dev(String name) {
        super(name);


    }

    //void walk(int steps) {
        //System.out.println("dev yo" + steps + name);
    //}
}

public class OOPS {
    public static void main(String[] args) {

        Person p = new Person("OOF");
        p.walk(69);

        Dev d = new Dev("oooodevv");
        d.walk(90);

        System.out.println(Person.count);


    }
}
