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
public class Ex15 {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
        System.out.println("Celular");
        System.out.println("Digite a marca do celular");
        String marcaCelular = scn.nextLine();
        System.out.println("Digete o modelo do celular");
        String modeloCelular = scn.nextLine();
        System.out.println("Digete o preço do celular");
        double precoCelular = scn.nextDouble();
        double precoCelularFinal = ((precoCelular * 0.28)+((precoCelular * 0.28)*0.20))+precoCelular;
        System.out.println("A marca do celular é: "+marcaCelular+" o modelo é "+modeloCelular
                +" e o valor final R$"+precoCelularFinal);
    
    
    
    }
    
    
    
}
