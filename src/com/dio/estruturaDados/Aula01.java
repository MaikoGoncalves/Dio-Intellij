package com.dio.estruturaDados;

public class Aula01 {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA="+ intA+ "  intB="+ intB);
        intA=2;
        System.out.println("intA="+ intA+ "  intB="+ intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("OBJA="+ objA + "  OBJB="+ objB);
        objA.setNum(2);
        System.out.println("OBJA="+ objA+ "  OBJB="+ objB);
        System.out.println("Teste");
        objB.setNum(4);
        System.out.println("OBJA="+ objA+ "  OBJB="+ objB);

    }
}
