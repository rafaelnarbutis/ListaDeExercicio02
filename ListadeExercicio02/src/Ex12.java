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
public class Ex12 {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Saber quantos litros");
        System.out.println("Digite o valor do Litro de Gasolina!!");
        double valorGasolina = scn.nextDouble();
        System.out.println("Digite o valor a pagar");
        double valorApagar = scn.nextDouble();
        double result = valorApagar / valorGasolina  ;
        System.out.println("Você colocou "+result +" litros de gasolina");
    
    
    
    }
    
    
}
