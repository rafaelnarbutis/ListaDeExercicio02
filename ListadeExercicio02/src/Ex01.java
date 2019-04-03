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
public class Ex01 {
    
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
    
        System.out.println("Digite sua Primeira nota");
        double primeiraNota = scn.nextDouble();
        System.out.println("Digite sua segunda nota");
        double segundaNota = scn.nextDouble();
        System.out.println("Digete sua terceira nota");
        Double terceiraNota = scn.nextDouble();
        
        double result = (primeiraNota + segundaNota + terceiraNota) / 3;
        System.out.println("Sua media aritimetica foi:"+result);
    }
    
    
    
    
}
