package com.dio;

public class BoasPraticas {
    public static void main(String[] args) {
        int i;
        //int i; não pode 2x
        int I;
       // int 1a; não pode começar com numero
        int _1a;// não e boa pratica
        int $aq;

        i   = 05;
        I   = 10;
        _1a = 20;
        $aq = 07;

      final int j = 10;
     // j = 15;
      int asrn24678md = 100;
      //int asrn246 78md;
      int asrn2$4678_md = 10;
      //int asrn2$46%78_md = 10;

        int quantidadeProduto = 50;
       // int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
