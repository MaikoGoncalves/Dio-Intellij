package com.dio.calculadora;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horasaida = 0;
        int tempoviagem = 0;
        int fuso = 0;
        int ajuste = 0;
        int horaTotal = 0;

        System.out.println("Desafio Fuso Horário");

        System.out.println("Entre com a hora de saida: ");
        horasaida = scan.nextInt();
        System.out.println("Entre com o tempo de viagem: ");
        tempoviagem = scan.nextInt();
        System.out.println("Entre com o fuso horario: ");
        fuso = scan.nextInt();

        if (horasaida == 0) {
            horasaida = 24;
        }
        ajuste = horasaida + tempoviagem + fuso;

        if (ajuste >= 24) {
            ajuste = ajuste - 24;
        }
        System.out.println(ajuste);
    }
}
