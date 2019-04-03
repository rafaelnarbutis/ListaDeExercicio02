/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
import java.util.Scanner;
public class Ex10 {
    
     public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     
         System.out.println("Digite a quantia em segundos para saber Horas,"
                 + "Minutos e segundos");
         System.out.print("Digite os segundos desejados: ");
         int segundos = scn.nextInt();
         int horas = segundos / 3600 ;
         int minutos = (segundos % 3600) / 60;
         int segundosResult = (segundos % 3600) % 60;
         System.out.println("==== Resulatdo =====");
         System.out.println("Total de horas: "+horas);
         System.out.println("Total de minutos: "+minutos);
         System.out.println("Total de segundos: "+segundosResult);
     
     }
      
      
        
    
    
}
