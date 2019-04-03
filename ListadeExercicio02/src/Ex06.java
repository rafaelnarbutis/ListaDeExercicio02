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
public class Ex06 {
    
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     System.out.println("Calcular salario final do mes");
     System.out.print("Digite o nome do vendedor: ");
     String nomeVendedor = scn.nextLine();
     System.out.print("Digite o Salario fixo do vendedor: ");
     double salarioFixo = scn.nextDouble();
     System.out.print("Digite o total de vendas que ele fez: ");
     double totalVendas = scn.nextDouble();
     double dinheiroFinal = (totalVendas * 0.015)+salarioFixo;
     System.out.println("==== Resultado ====");
     System.out.println("O salario do vendedor no final do mes sera "+ dinheiroFinal);
     
    }
    
    
    
    
}
