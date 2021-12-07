package com.dio.estruturaDados;

public class NoJavaTeste {
    public static void main(String[] args) {

        NoJava no1 = new NoJava("Conteudo no1");

        NoJava no2 = new NoJava("Conteudo no2");
        no1.setProximoNo(no2);// no apontando para no2

        NoJava no3 = new NoJava("Conteudo no3");
        no2.setProximoNo(no3);// no apontando para n3

        NoJava no4= new NoJava("Conteudo no4");
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
