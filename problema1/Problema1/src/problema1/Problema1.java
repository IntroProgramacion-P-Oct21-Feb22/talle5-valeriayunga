/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorCostoPorKilovatio;
        double valorMes;
        int edad;
        double descuento;
        double pocentaje = 10;
        double subtotal;
        double valorTotal=0 ;       
        
        System.out.println("Ingresar el Costo por Kilovatio");
        valorCostoPorKilovatio = entrada.nextDouble(); 
        
        System.out.println("Ingresar el valor al Mes");
        valorMes = entrada.nextDouble();
        
        System.out.println("Ingresar la edad");
        edad = entrada.nextInt();
                 
        subtotal = valorCostoPorKilovatio * valorMes;

        if (edad> 65) {
            descuento = (pocentaje*subtotal )/100;
            valorTotal = subtotal-descuento;
        }else{ 
            valorTotal = subtotal;
            
        } 
    
      System.out.printf("El valor total a pagar es: %.2f\n", valorTotal); 
         
        }

       
    }
    

