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
public class Ex17 {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
    
        System.out.println("Digite a quantia em metros da sua casa ate o trabalho");
        double distaciaTrabalho = scn.nextDouble();
        //Estou multiplicando por dois pois tem a ida e a volta
        double result = (((distaciaTrabalho * 2)*5)*45)/1000;
        System.out.println("Você andou "+result+" Km");
    
    }
    
    
}
