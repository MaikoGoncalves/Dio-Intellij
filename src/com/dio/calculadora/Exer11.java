package com.dio.calculadora;

public class Exer11 {
    // break out;   Forma marcada sai dos dois loop.
    public static void main(String[] args) {
        System.out.println("\nCom o for");
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            if (i == 12) {
                break;
            }
        }
        System.out.println("\nCom o While");
        int count = 1;
        while (count <= 14) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            if (count == 12) {
                break;
            }
            count++;
        }
    }
}