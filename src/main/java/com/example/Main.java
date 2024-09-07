package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        // Semana 4 actividad 1

        System.out.println("Ingrese el valor de la cuenta incluyendo el IVA:");
        double valorCuenta = valor.nextDouble();
        
        System.out.println("porcentaje de propina que desea dejar.");
        double porcentajePropina = valor.nextDouble();

        porcentajePropina = porcentajePropina / 100;
        double valorPropina = valorCuenta * porcentajePropina;
        double valorTotal = valorCuenta + valorPropina;

        System.out.println("El valor de la cuenta: " + valorCuenta );
        System.out.println("Porcentaje de propina elegido: " + porcentajePropina * 100 + '%');
        System.out.println("Valor propina: " + valorPropina);
        System.out.println("Valor total a pagar: " + valorTotal);
        System.out.println("Gracias por su compra es un gusto atenderlo...");

        valor.nextLine();

        // Semana 4 actividad 2

        System.out.println("Ingrese el recorrido en kilometros: ");
        double distancia = valor.nextDouble();

        System.out.println("Cuanto tiempo desea esperan en trafico ingresar min: ");
        double tiempoEspera = valor.nextDouble();

        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;

        distancia  = distancia * valorKilometro;
        tiempoEspera = tiempoEspera * valorMinuto;

        double precioTotal = tarifaBase + distancia + tiempoEspera;
        System.out.println("Precio del viaje: " + precioTotal);

        valor.nextLine();

         // Semana 4 actividad 3

        System.out.println("Ingrese el mensaje codificado: ");
        String mensajeCodificado = valor.nextLine();

        String mensajeDecodificado = mensajeCodificado
        .replace("0", "o")
        .replace("3", "e")
        .replace("4", "a")
        .trim()
        .replaceAll("\\s+", " ")
        .toUpperCase();


        System.out.println("El mensaje decodificado es: " + mensajeDecodificado ); 
        

        valor.close();



    }
}