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
public class Ex03 {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
        System.out.println("Multiplicação de 3 numeros");
        System.out.println("Digite o primeiro numero");
        Double primeiroNumero = scn.nextDouble();
        System.out.println("Digite o segundo numero");
        Double segundoNumero = scn.nextDouble();
        System.out.println("Digite o terceiro numero");
        Double terceiroNumero = scn.nextDouble();
        Double result = primeiroNumero * segundoNumero * terceiroNumero;
        System.out.println("O resultado da multiplicação dos 3 numeros é: "+result);
    
    
    }
    
    
    
    
}
