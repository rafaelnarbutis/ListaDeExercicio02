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
public class Ex05 {
    
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        System.out.println("Area e perimetro do quadrado");
        System.out.println("Digite o valor do lado do quadrado");
        double primeiroLado = scn.nextDouble();      
        double areaQuadrado = primeiroLado * primeiroLado;
        double perimetroQuadrado = 4 * primeiroLado;
        System.out.println("==== Resultado ====");
        System.out.println("A area do quadrado é: "+ areaQuadrado);
        System.out.println("O perimetro do quadrado é: "+ perimetroQuadrado+" cm²");
    
    
    
    
    }
    
    
    
}
