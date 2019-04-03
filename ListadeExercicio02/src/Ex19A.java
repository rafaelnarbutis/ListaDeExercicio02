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
public class Ex19A {
    
    
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros para pegar a porcentagem do "
                + "primeiro em relação ao segundo");
        System.out.println("Digite o primeiro numero inteiro");
        int primeiroNumero = scn.nextInt();
        System.out.println("Digite o degunfo numero inteiro");
        int segundoNumero = scn.nextInt();
        int result = (segundoNumero / primeiroNumero) * 100;
        System.out.println("O resultado será "+result+"%");
        
        
    }
}

