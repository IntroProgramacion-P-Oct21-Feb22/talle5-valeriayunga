/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero_dias;
        double precio_habitacion;
        double subtotal;
        double descuento1;
        double descuento2;
        double descuento3;
        double porcentaje1 = 10;
        double porcentaje2 = 15;
        double porcentaje3 = 20;
        double total_pagar = 0;

        System.out.println("Ingresar el número de días en la hosteria");
        numero_dias = entrada.nextInt();

        System.out.println("Ingresar el precio de la habitación");
        precio_habitacion = entrada.nextDouble();

        subtotal = numero_dias * precio_habitacion;

        if (numero_dias < 0) {
            subtotal = 0;
            total_pagar = 0;
        } else {
        
            if (numero_dias <= 5 && numero_dias >= 0) {
                total_pagar = subtotal;
            } else {
            
            if (numero_dias > 5 && numero_dias <= 10) {
                descuento1 = (porcentaje1 * subtotal) / 100;
                total_pagar = subtotal - descuento1;
            } else {
                if (numero_dias > 10 && numero_dias <= 15) {
                    descuento2 = (porcentaje2 * subtotal) / 100;
                    total_pagar = subtotal - descuento2;
                } else {
                    descuento3 = (porcentaje3 * subtotal) / 100;
                    total_pagar = subtotal - descuento3;
                }
            
            }
        }
        }
        System.out.printf("El total a pagar es: %.2f\n", total_pagar);
        System.out.printf("El subtotal a pagar es: %.2f\n", subtotal);
    }

}
