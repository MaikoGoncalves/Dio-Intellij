package com.dio.estruturaDados;

public class Generics<T> {

    private T conteudo;
    private Generics<T> proximoNo;

    public Generics(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Generics<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Generics<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "conteudo=" + conteudo +
                '}';
    }
}
