package com.dio.calculadora;

import java.util.Random;

public class Exer09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nroAleatorios = new int[10];
        int[][] M = new int[4][4];

        for (int i = 0; i < nroAleatorios.length; i++) {
            int numero = random.nextInt(100);
            nroAleatorios[i] = numero;
        }
        System.out.println("Numeros Aleatorios: ");
        for (int numero : nroAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores");
        for (int numero : nroAleatorios) {
            System.out.print((numero + 1) + " ");
        }
        System.out.println("\nAntecessores");
        for (int numero : nroAleatorios) {
            System.out.print((numero - 1) + " ");
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println("");
        }
    }
}
