package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digita la temperatura actual");
        Double temperaturaAmbiente= teclado.nextDouble();
        String temperaturaComoTexto=temperaturaAmbiente.toString()
        switch (temperaturaComoTexto){
            case 20.0:
                temperaturaAmbiente=20.0
                        break;
            case 30:
                temperaturaAmbiente=25.0;
                break;
                case 40.0
                    temperaturaAmbiente=20.0;
                    System.out.println("se esta muriendo perro");
                    break:
            default:
                System.out.println("digite la temperatura");
        }
    }
}
