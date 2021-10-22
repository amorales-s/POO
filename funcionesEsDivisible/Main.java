package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;  //definimos objeto scanner
        scanner = new Scanner(System.in);
        int n;
        int divisor;
        System.out.println("Ingrese primer valor:");
        n= scanner.nextInt();
        System.out.println("Ingrese divisor valor:");
        divisor= scanner.nextInt();
        if (esDivisible(n,divisor)){
            System.out.println("es divisible");
        }
        else System.out.println("No es divisible");

    }
   public static boolean esDivisible(int n, int divisor){
        if(n%divisor == 0 ){
            return true;
        }
        else return false;
    }
}
