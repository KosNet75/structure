package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 18));
        System.out.println(intsCalc.mult(10, 12));
        System.out.println(intsCalc.pow(3, 3));

    }
}