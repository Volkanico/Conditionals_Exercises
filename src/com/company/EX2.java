package com.company;

public class EX2 {
    public static void Ex2() {
        //EX 2
        int x = 4;
        int y = 2;

        if (x == 1) {
            System.out.println("a no és multiple de 2");
        }
        if (y == 2) {
            System.out.println("a és multiple de 2");
        }
        boolean bool = false;

        int modul = x % y;

        if (modul == 0) {
            //parell
            System.out.println(x + " no es multiple de ");
            System.out.println(y + " es multiple de");
        }
        else {
            //imparell
        }
        System.out.println( 2 );
    }
}
