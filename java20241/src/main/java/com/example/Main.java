package com.example;
import java.util.Scanner;

@author //Diego Garrido Calderon U20232217117//

public class Main {
    // public static void main(String[] args) {
        
    //     // EJERCICIO # 1//

    //     @SuppressWarnings("resource")
    //     Scanner scanner = new Scanner (System.in);
        
    //     System.out.println("Digite el numero de computadoras a comprar:");
    //     int numeroPcs = scanner.nextInt();

    //     double precioPc = 500.0;
    //     double descuento;
    //     double totalSinDesc = numeroPcs * precioPc;
    //     double totalConDesc;

    //     if (numeroPcs < 5){
    //         descuento = totalSinDesc * 0.10;
    //     } else if (numeroPcs <= 10){
    //         descuento = totalSinDesc * 0.20;
    //     } else {
    //         descuento = totalSinDesc * 0.40;
    //     }

    //     totalConDesc = totalSinDesc - descuento;

    //     System.out.println("Precio total sin descuento: $" + totalSinDesc);
    //     System.out.println("Descuento: $" + descuento);
    //     System.out.println("Precio total con descuento: $" + totalConDesc);
    // }


    /// EJERCICIO # 2///

        // public static void main(String[] args) {
            
        //     Scanner scanner = new Scanner(System.in);

        //     System.out.println("ingrese la cantidad de llantas a comprar: ");
            
        //     int cantidadLlantas = scanner.nextInt();
        //     int precioPorLlanta;
        
        //     // if (cantidadLlantas < 5){
        //     //     precioPorLlanta = 100;
        //     // } else if (cantidadLlantas <=10){
        //     //     precioPorLlanta = 75;
        //     // } else {
        //     //     precioPorLlanta = 50;
        //     // }

            

        //     int categoria = cantidadLlantas < 5 ? 1 : cantidadLlantas <= 10 ? 2 : 3;

        //     switch (categoria) {
        //         case 1:
        //             precioPorLlanta = 100;
        //             break;
        //         case 2:
        //             precioPorLlanta = 75;
        //             break;
        //         case 3:
        //             precioPorLlanta = 50;
        //             break;
        //         default:
        //             precioPorLlanta = 0; // Este caso no debería ocurrir
        //             break;
        //     }
    

        //     int totalPagar = precioPorLlanta * cantidadLlantas;
            
        //     System.out.println("Precio por llanta: $" + precioPorLlanta);
        //     System.out.println("Total a pagar por las " + cantidadLlantas + " Llantas: $" + totalPagar);

        //     scanner.close();
        // }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("ingrese el precio sin iva del reproductor");
            double precioSinIva = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Ingrese la marca del reproductor: ");
            String marca = scanner.nextLine();

            String marcaNosy = "NOSY";

            if (precioSinIva >= 500){

                precioSinIva -= precioSinIva * 0.10;

            }
            if (marca.equalsIgnoreCase(marcaNosy) ) {
                precioSinIva -= precioSinIva * 0.05; // Descuento adicional del 5&
            }


            //Calcular el IvA

            double iva = precioSinIva * 0.19;

            //Calcular el precio total a pagar con el iva incluido

            double precioTotal = precioSinIva + iva;

            //Mostrar resultado

            int precioTotal1 = (int) precioTotal;
            System.out.println("El precio total a pagar por el reproductor con iva incluido es $: " + precioTotal1);

            scanner.close();



        }

}