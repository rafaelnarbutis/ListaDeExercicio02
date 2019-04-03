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
public class Ex09 {
    
    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.println("Media ponderada");
        System.out.println("Digite a primeira nota");
        double primeiraNota = scn.nextDouble();
        System.out.println("Digite a segunda nota");
        double segundaNota = scn.nextDouble();
        System.out.println("Digite a terceira nota");
        double terceiraNota = scn.nextDouble();
        
        double result = ((primeiraNota * 2) +(segundaNota * 3) + (terceiraNota * 5)) / 10;
        System.out.println("Sua media final foi: "+result);
        
        
        
    
    
    }
    
    
    
}
