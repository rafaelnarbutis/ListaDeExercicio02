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
public class Ex13 {
    
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
        System.out.println("Area do Triangulo");
        System.out.println("Digite a Base do triangulo");
        double baseTriangulo = scn.nextDouble();
        System.out.println("Digite a aultura do trinagulo");
        double alturaTriangulo = scn.nextDouble();
        double result = (baseTriangulo * alturaTriangulo)/2;
        System.out.println("A area do triangulo é "+result+" cm²");
    
    
    
    }
    
    
}
