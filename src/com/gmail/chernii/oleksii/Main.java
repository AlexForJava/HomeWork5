package com.gmail.chernii.oleksii;

import java.util.Scanner;

/**
 * Created by Space on 07.03.2019.
 */
public class Main {
    private static Calculator calculator = (first, second, action) ->
            (action == '+') ? (first + second) :
                    (action == '*') ? (first * second) :
                            (action == '-') ? (first - second) :
                                    (action == '$' && second != 0) ? (Math.pow(first, 1. / second)) :
                                            (action == '^') ? (Math.pow(first, second)) :
                                                    (action == '#' && first != 0) ? ((first + second) / first * 1.0 + 117.) : intIllegalArgumentException();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Enter first number");
            int first = Integer.valueOf(sc.nextLine());
            System.out.println("Enter second number");
            int second = Integer.valueOf(sc.nextLine());
            System.out.println("Enter action");
            char action = sc.nextLine().charAt(0);
            System.out.println("answer = " + calculator.calculate(first, second, action));
            System.out.println("Stop? - Yes/No");
            stop = (sc.nextLine().equalsIgnoreCase("yes")) ? true : false;
        }
    }

    private static int intIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
}
