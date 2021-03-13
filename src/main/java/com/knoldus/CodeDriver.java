package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        String firstNo = scanner.nextLine();
        System.out.println("Please enter another number");
        String secondNo = scanner.nextLine();
        System.out.println(RangeMultiplication.multiply(firstNo,secondNo));

    }
}
