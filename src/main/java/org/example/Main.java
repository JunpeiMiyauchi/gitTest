package org.example;

import testpackage.Fizzbuzz;

public class Main {
    public static void main(String[] args) {
        Fizzbuzz f = new Fizzbuzz();
        for (int i = 0; i < 100; i++) {
            System.out.println(f.fizzBuzz(i));
        }
    }
}