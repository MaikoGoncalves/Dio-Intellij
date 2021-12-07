package com.dio.calculadora;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
