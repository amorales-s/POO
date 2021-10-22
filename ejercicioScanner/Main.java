package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;  //definimos objeto scanner
        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicialN;
        char inicialA;
        System.out.println("Digite el nombre:");
        nombre= scanner.nextLine();
        System.out.println("Digite el Apellido:");
        apellido= scanner.nextLine();
        inicialN= nombre.charAt(0);
        inicialA= apellido.charAt(0);

        System.out.println("Sus iniciales son:" + inicialN + " " + inicialA);
    }
}
