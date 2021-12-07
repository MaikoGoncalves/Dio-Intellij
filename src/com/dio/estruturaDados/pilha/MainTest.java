package com.dio.estruturaDados.pilha;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha minhaPilha = new Pilha();
        int aux, aux1;
        boolean test = true;
        do {
            System.out.println("___________________PILHA__________________________");
            System.out.println(" Digite 1 para colocar(PUSH) um numero na Pilha ");
            System.out.println(" Digite 2 para retirar(POP)  um numero na Pilha ");
            System.out.println(" Digite 3 para imprimir a Pilha ");
            System.out.println(" Digite 0 para Sair");
            System.out.println("__________________________________________________");
            aux1 = sc.nextInt();
            switch (aux1) {
                case 1:
                    System.out.println("Digite um numero para entrar na pilha");
                    aux = sc.nextInt();
                    minhaPilha.push(new No(aux));
                    break;
                case 2:
                    System.out.println("Valor do POP = " + minhaPilha.pop());
                    break;
                case 3:
                    System.out.println(minhaPilha);
                    break;
                case 0:
                    test = false;
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        } while (test);

    }
}
