package com.dio.estruturaDados;

public class NoJava {
    private String conteudo;
    private NoJava proximoNo;

    public NoJava(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public NoJava getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoJava proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoJava{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
