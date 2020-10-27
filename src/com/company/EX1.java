package com.company;

import java.util.Scanner;

public class EX1 {
    public static void Ex1() {
        //EX 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix numero a analitzar: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("a no és negatiu ni positiu");
        }
        if (a > 0) {
            System.out.println("a és positiu");
        }
        if (a < 0) {
            System.out.println("a és negatiu");
        }
    }
}
