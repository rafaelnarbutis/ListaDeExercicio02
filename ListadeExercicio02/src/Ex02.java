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
public class Ex02 {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ola");
        System.out.print("Digite seu Nome: ");
        String nome = scn.nextLine();
        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scn.nextLine();
        System.out.print("Digite seu endereço: ");
        String endereco = scn.nextLine();
        System.out.print("Digite seu Telefone: ");
        String telefone = scn.nextLine();
        System.out.println("\n=====Ficha=====\n");
        System.out.println("Seu nome é: "+nome);
        System.out.println("Estado civil: "+estadoCivil);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        
        
    
    
    }
    
    
    
}
