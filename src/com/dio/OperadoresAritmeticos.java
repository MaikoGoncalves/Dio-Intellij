package com.dio;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int k=7,m=6;
        int j;
        j = k++ + m;
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        k=7;
        m=6;
        j = ++k + m;
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        k=7;
        m=6;
        j = ++k + m/2;
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        k=7;
        m=6;
        j = k++ + m/2;
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);

        byte b1;
        short s1 = 1000;
        b1=(byte)s1;
        System.out.println(s1);
        System.out.println(b1);
        long l1;
        int i1 = 10;
        l1 = i1;
        System.out.println(i1);
        System.out.println(l1);
        int i2;
        long l2=10000000000000l;
        i2 = (int) l2;
        System.out.println(l2);
        System.out.println(i2);

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;
        System.out.println(f4);
        System.out.println(i4);
int i = 3;
   int x = 10 - 5 * 2 + --i;
        System.out.println(x);
    }
}
