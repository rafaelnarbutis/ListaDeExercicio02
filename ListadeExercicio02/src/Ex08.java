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
public class Ex08 {
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite os dias para saber anos, meses, dias");
        System.out.print("Digite os dias desejados:");
        int dias = scn.nextInt();
        int anos = dias / 365;
        //Divide dias por 365que vai geral um numero inteiro e multiplico por 12
        int meses = (dias / 365) * 12;
        /*pego o resto da divisão e divido por 30 que se for verdadeiro 
        ira gerar numeros inteiros para eu somar */
        int somaMeses = (dias % 365) / 30;
        int totalMeses =  meses + somaMeses ;
        /* Uso a mesma logica de pegar o total de meses so que uso o resto da divisao
        so que se ela der 0 ele nao ira somar caso de resto ele soma*/
        int diasSobrados = (dias % 365)% 30 ;
        
        System.out.println("Quantia de anos: "+anos);
        System.out.println("Quantia de meses: "+totalMeses);
        System.out.println("Qunatia de dias: "+diasSobrados);
    }
    
    
    
}
