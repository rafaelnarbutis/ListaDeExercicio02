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
public class Ex18 {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Tranforamndo Celsius para Kelvin e Fahrenheit");
        System.out.println("Digite o valor em Celsius");
        double valorCelsius = scn.nextDouble();
        double resultKelvin = valorCelsius + 273 ;
        double resultFahrenheit = (1.8 * valorCelsius) + 32;
        System.out.println("====== Conversões =====");
        System.out.println("Valor em Kelvin: "+resultKelvin+" K");
        System.out.println("Valor em Fahrenheit: "+resultFahrenheit+"ºF");
    
    
    }
    
    
    
}
