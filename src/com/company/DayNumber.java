package com.company;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number from 1 to 366");
        int day = input.nextInt();
        System.out.println("The day number is" + " " + day);
        if (day >= 1 && day <= 31)
            System.out.println("It is:January");
        if ((day > 31) && (day <= 31 + 28))
            System.out.println("It is: February");
        if ((day > 31 + 28) && (day <= 31 + 28 + 31)) ;
        System.out.println("It is: March");
        if ((day > 31 + 28 + 31) && (day <= 31 + 28 + 31 + 30))
            System.out.println("It is: April");
        if ((day > 31 + 28 + 31 + 30) && (day <= 31 + 28 + 31 + 30 + 31))
            System.out.println("It is: May");
    }
}