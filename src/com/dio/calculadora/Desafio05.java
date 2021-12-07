package com.dio.calculadora;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor ");
        int N = leitor.nextInt();
        int numero=0;
        for (int i = 0 ; i < N ; i++){
            numero = leitor.nextInt();
            if(numero ==0){
                System.out.println("NULL");
            }
            else if( numero > 0 && numero%2==0){
                System.out.println("EVEN POSITIVE");
            }else if( numero < 0 && numero%2==0){
                System.out.println("EVEN NEGATIVE");
            }else if( numero > 0 && numero%2!=0){
                System.out.println("ODD POSITIVE");
            }else if( numero < 0 && numero%2!=0){
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}
