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
public class Ex14 {
    
    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.println("quociente e resto");
        System.out.println("Digite o primeiro numero inteiro");
        int primeiroInteiro = scn.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int segundoInteiro = scn.nextInt();
        int quociente = primeiroInteiro / segundoInteiro ;
        int resto = primeiroInteiro % segundoInteiro;
        System.out.println("O quociente é "+quociente+" e o resto é "+resto);
    
    
    }
    
    
    
}
