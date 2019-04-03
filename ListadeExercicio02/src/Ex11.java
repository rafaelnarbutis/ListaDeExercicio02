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
public class Ex11 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        System.out.println("Terrenos retangulares");
        System.out.println("Digite a base do Terreno em metros");
        double baseTerreno = scn.nextDouble();
        System.out.println("Digite a altura do Terreno em metros");
        double alturaTerreno = scn.nextDouble();
        System.out.println("Preço do metro quadrado");
        double precoTerreno = scn.nextDouble();
        
        double areaTerreno = baseTerreno * alturaTerreno;
        double valorTerreno = areaTerreno * precoTerreno;
        
        System.out.println("A area do Terreno é de "+areaTerreno+" Metros "
        +"e o valor dele é R$"+valorTerreno);
        
    
    
    }
}
