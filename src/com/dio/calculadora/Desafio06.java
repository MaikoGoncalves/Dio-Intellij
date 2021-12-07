package com.dio.calculadora;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!
        while (true) {
            x1 = 3;
            y1 = 5;
            x2 = 3;
            y2 = 5;
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if (x1 == x2 && y1 == y2) {
                System.out.println("0");
                break;
            } else if (x1 == x2 || y1 == y2) {
                System.out.println("1 linha coluna");
                break;
            } else if (y1-x1 == y2-x2 || y1-y2== x2-x1) {
                System.out.println("1 diagonal");
                break;
            } else {
                System.out.println("2");
                break;
            }
        }
        sc.close();
    }


}
