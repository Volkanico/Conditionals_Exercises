package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    System.out.println ("Introdueix l'exercici que es vol dur a terme");
    int option = sc.nextInt();
    switch (option) {
        case 1: EX1.Ex1();
        break;
        case 2: EX2.Ex2();
        break;
        case 3: EX3.Ex3();
        break;
        case 4: EX4.Ex4();
        break;
        case 5: EX5.Ex5();
        break;
        case 6: EX6.Ex6();
        break;
        case 7: EX7.Ex7();
        default:

    }
    }
}