package com.dio.calculadora;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        String[] vogal = new String[6];
        int qtdadeConsoantes = 0;
        int qtdadeVogal = 0;
        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdadeConsoantes++;
            } else {
                vogal[count] = letra;
                qtdadeVogal++;
            }
            count++;
        } while (count < consoantes.length);
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print("[" + consoante + "] ");
            }
        }
        System.out.println("\n Quantidade de Consoantes = " + qtdadeConsoantes);
        for (String vog : vogal) {
            if (vog != null) {
                System.out.print("[" + vog + "] ");
            }
        }
        System.out.println("\n Quantidade de Volgais = " + qtdadeVogal);
    }
}
