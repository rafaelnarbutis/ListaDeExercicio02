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
import javax.naming.spi.DirStateFactory;
public class Ex20 {
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro numero de ponto flutuante");
        double primeiroNumero = scn.nextDouble();
        System.out.println("Digite o segundo numero de ponto flutuante");
        double segundoNumero = scn.nextDouble();
        double valorOposto = segundoNumero - (2 * segundoNumero);
        double valorInverso = 1 / primeiroNumero;
        double valorElavado = Math.pow(primeiroNumero, segundoNumero);
        double valorSoma = (primeiroNumero / 2 ) + segundoNumero;
        double valorVezes = primeiroNumero * segundoNumero;
        System.out.println("O valor oposto de "+segundoNumero+" é "+valorOposto);
        System.out.println("O valor inverso de "+primeiroNumero+" é "+valorInverso);
        System.out.println(primeiroNumero+" elevado a "+segundoNumero+" é " +valorElavado);
        System.out.println("A soma de "+segundoNumero+" com a metade de "+primeiroNumero
        +" é igual a "+valorSoma);
        System.out.println(primeiroNumero+" x "+segundoNumero+" = "+valorVezes);
    
    
    }
   
}
