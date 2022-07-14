package com.tripathy;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<0) {
            System.out.println("Marks can not be negative: Your entry= "+a);
        } else if(a>0 && a<35) {
            System.out.println("You need to work hard");
        } else if(a>=35 && a<50) {
            System.out.println("Your score is not bad, but you need improvement, you got C Grade");
        } else if(a>=50 && a<60) {
            System.out.println("You can improve performance you got C+ grade");
        } else if(a>=60 && a<70) {
            System.out.println("Good performance with B grade");
        } else if(a>=70 && a<80) {
            System.out.println("You can get better grade with little more efforts, your grade is B");
        } else if(a>=80 && a<90) {
            System.out.println("Very good performance, your grade is A");
        } else if(a>=90 && a<=100) {
            System.out.println("One of the best performance, Your grade is A+");
        } else if(a>100) {
            System.out.println("Marks can not be more than 100: Your entry= "+a);
        } else if(a==0) {
            System.out.println("You got Zero Marks: Go to LABS");
        }

    }
}

//help me god. i fucked up. i dunno what to do. im soaking up in immersive pain and guilt. just help.