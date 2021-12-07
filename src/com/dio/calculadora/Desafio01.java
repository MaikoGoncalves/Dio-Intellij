package com.dio.calculadora;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = 5;
        int C = 91;

        if ((L % 2!=0 && C % 2!=0) || (L % 2==0 && C % 2==0 )) {
            System.out.println("1");
        } else {
            System.out.println("0");

        }
    }
}