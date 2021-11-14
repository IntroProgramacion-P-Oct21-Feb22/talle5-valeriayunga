/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double porcentaje1 = 20;
        double porcentaje2 = 30;
        double porcentaje3 = 15;
        double porcentaje4 = 8;
        double impuesto = 0;
        double precio_venta = 0;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania")) {
            impuesto = (porcentaje1 * costo) / 100;
            precio_venta = (costo + impuesto);

        } else {
            if (origen.equals("Japón")) {
                impuesto = (porcentaje2 * costo) / 100;
                precio_venta = (costo + impuesto);

            } else {
                if (origen.equals("Italia")) {
                    impuesto = (porcentaje3 * costo) / 100;
                    precio_venta = (costo + impuesto);

                } else {
                    if (origen.equals("USA")) {
                        impuesto = (porcentaje4 * costo) / 100;
                        precio_venta = (costo + impuesto);
                    }else{
                        System.out.println
                         ("El origen de su automóvil no es válido");

                    }
                }
               
            }
        }
        
        System.out.printf("Su impuesto por pagar es:%.2f\n", impuesto);
                
         System.out.printf("El precio de venta de su %s" +" "+"es: %.2f\n "
         ,marca ,precio_venta);
    }

}
