package com.gmail.chernii.oleksii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Space on 10.03.2019.
 */
public class MainMap {
    private static Map<Character, Calculator> map = new HashMap<>();

    static {
        map.put('+', (first, second, action) -> first + second);
        map.put('-', (first, second, action) -> first - second);
        map.put('*', (first, second, action) -> first * second);
        map.put('/', (first, second, action) -> first / second);
        map.put('^', (first, second, action) -> Math.pow(first, second));
        map.put('$', (first, second, action) -> Math.pow(first, 1.0 / second));
        map.put('#', (first, second, action) -> ((first + second) / first * 1.0 + 117.));
    }

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
            System.out.println("answer = " + map.get(action).calculate(first, second, action));
            System.out.println("Stop? - Yes/No");
            stop = (sc.nextLine().equalsIgnoreCase("yes")) ? true : false;
        }
    }
}
