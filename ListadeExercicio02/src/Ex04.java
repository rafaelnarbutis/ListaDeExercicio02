/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael.fnarbutis
 */
import java.util.Scanner;
public class Ex04 {
    
    
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
    
        System.out.println("Cubo de dois numeros");
        System.out.println("Digite o primeiro numero!!");
        double primeroNumero = scn.nextDouble();
        System.out.println("Digite o segundo numero!!");
        double segundoNumero = scn.nextDouble();
        double primeiroResultado = Math.pow(primeroNumero, 3);
        double segundoResultado = Math.pow(segundoNumero, 3);
        System.out.println("==== Resultado =====");
        System.out.println(primeroNumero+" ao cubo fica igual: "+primeiroResultado);
        System.out.println(segundoNumero+"ao cubo fica igual: "+segundoResultado);
      
      
    
    }
  
    
}
