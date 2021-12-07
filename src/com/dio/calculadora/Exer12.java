package com.dio.calculadora;

public class Exer12 {
    public static void main(String[] args) {
        byte [] bytes = new byte[2];
        bytes[1] = 100;

        float[] floats = new float[2];
        floats[1] = 20.4f;

        for (byte byte_ : bytes) {
            System.out.println("Bytes: " + byte_);
        }
        for (float floats_ : floats) {
            System.out.println("Float: " + floats_);
        }

        for (int i = 10 ; i> -1; i--){
            System.out.println(i);

        }

    }
}
