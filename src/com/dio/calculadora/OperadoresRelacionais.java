package com.dio.calculadora;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int i1=10;
        int i2=20;
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 >  i2);
        System.out.println(i1 <  i2);

        float f1= 4.45f;
        float f2= 3.45f;
        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
        System.out.println(f1 >  f2);
        System.out.println(f1 <  f2);

        String s1="Maiko";
        String s2="Lorenzo";
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        //System.out.println(s1 >  s2);
        //System.out.println(s1 <  s2);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        System.out.println(b1&&b2);
        System.out.println(b1&&b3);
        System.out.println(b2||b3);
        System.out.println(b2||b4);
        System.out.println(b1^b3);
        System.out.println(b4^b1);
        System.out.println(!b1);
        System.out.println(!b2);


        int i, num = 5;
        for (i = 0 ; i<3; i++) {
            num += 1;
            System.out.print(i);
            System.out.println("teste");
        }
           int n = 5 , cont = 1;
           while (cont <=3){
           ++cont;
           n+=cont;
           System.out.println(cont);
           System.out.println(n);

       }
        System.out.println(n);








    }


}
