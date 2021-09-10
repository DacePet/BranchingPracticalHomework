package com.company;

public class Main {

    public static void main(String[] args) {
        short noOne = 5;
        short noTwo = -10;
        if (noOne != noTwo && noOne > noTwo) {
            System.out.println("Number One is largest, Number Two is smallest");
        } else if (noOne != noTwo && noOne < noTwo)
            System.out.println("Number Two is largest, Number One is smallest");
        else
            System.out.println("Equal");
        if (noOne % 2 == 0) {
            System.out.println("Number One is even");
        } else
            System.out.println("Number One is odd");
        if (noTwo % 2 == 0) {
            System.out.println("Number Two is even");
        } else
            System.out.println("Number Two is odd");
        if (noOne < 0) {
            System.out.println("Number One is negative");
        } else
            System.out.println("Number One is positive");
        if (noTwo < 0) {
            System.out.println("Number Two is negative");
        } else
            System.out.println("Number Two is positive");
        if (noOne < 100)
            System.out.println("Number One is less than 100");
        if (noTwo < 100)
            System.out.println("Number Two is less than 100");
        else
            System.out.println("There are no numbers, less than 100");
    }
}
