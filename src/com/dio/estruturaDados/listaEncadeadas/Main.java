package com.dio.estruturaDados.listaEncadeadas;

public class Main {
    public static void main(String[] args) {

     ListaEncadeada<String> minhalistaEncadeada = new ListaEncadeada<>();

     minhalistaEncadeada.add("teste1");
     minhalistaEncadeada.add("teste2");
     minhalistaEncadeada.add("teste3");
     minhalistaEncadeada.add("teste4");

        System.out.println(minhalistaEncadeada.get(0));
        System.out.println(minhalistaEncadeada.get(1));
        System.out.println(minhalistaEncadeada.get(2));
        System.out.println(minhalistaEncadeada);

        System.out.println(minhalistaEncadeada.remove(3));
        System.out.println(minhalistaEncadeada);
    }
}
