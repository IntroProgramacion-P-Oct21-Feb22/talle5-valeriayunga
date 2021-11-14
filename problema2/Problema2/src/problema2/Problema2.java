/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cantidad_requerida;
        double precio_unitario;
        double subtotal;
        double porcentaje = 15;
        double descuento;
        String nombre_articulo;
        double valorTotal = 0;
        
        System.out.println("Ingrese Nombre del artículo");
        nombre_articulo = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad requerida");
        cantidad_requerida = entrada.nextDouble() ;
                
        System.out.println("Igrese el precio unitario");
        precio_unitario =  entrada.nextDouble();
        
        subtotal = cantidad_requerida * precio_unitario;
        
        if (cantidad_requerida > 50){
            descuento = (porcentaje * subtotal) / 100;
            valorTotal = subtotal - descuento;
        }else{
            valorTotal = subtotal;
            
        }
        System.out.printf("El valor total es: %.2f" +" "+
                "y pertenece al artículo:%s\n"
                , valorTotal, nombre_articulo);
    }
    
}
