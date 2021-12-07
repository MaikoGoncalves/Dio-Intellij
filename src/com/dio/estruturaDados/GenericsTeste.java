package com.dio.estruturaDados;

public class GenericsTeste {
    public static void main(String[] args) {
        Generics<String> no1 = new Generics<>("Conteudo no1");

        Generics<String> no2 = new Generics<>("Conteudo no2");
        no1.setProximoNo(no2);// no apontando para no2

        Generics<String> no3 = new Generics<>("Conteudo no3");
        no2.setProximoNo(no3);// no apontando para n3

        Generics<String> no4= new Generics<>("Conteudo no4");
        no3.setProximoNo(no4);// no apontando para n4

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println(no3);
        System.out.println(no4);

        System.out.println("--------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}