package com.dio.calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora  calculadora = new Calculadora();
        double a;
        double b;

        System.out.println("Digite um numero");
        a= scan.nextDouble();

        System.out.println("Digite um numero");
        b= scan.nextDouble();

      double somar =  calculadora.soma(a,b);
      double sub =  calculadora.sub(a,b);
      double mult =  calculadora.mult(a,b);
      double div =  calculadora.div(a,b);

      System.out.println(a + " + " + b + " = " + somar);
      System.out.println(a + " - " + b + " = " + sub);
      System.out.println(a + " * " + b + " = " + mult);
      System.out.println(a + " / " + b + " = " + div);

    }
}
