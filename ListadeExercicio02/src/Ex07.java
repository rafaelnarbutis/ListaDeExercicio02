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
public class Ex07 {
 
    
    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite sua idade!!");
        int idade = scn.nextInt();
        int diasVividos = idade * 360;
        System.out.println("Você viveu "+diasVividos+" dias");
    
    }

    
  
  
}
