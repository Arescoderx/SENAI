/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira o seu nome:");
        String nome = ler.nextLine();
        
        System.out.println("Insira o seu sexo (M/F):");
        String sexo = ler.nextLine();
        
        System.out.println("Insira o valor das suas compras:");
        float preco = ler.nextFloat();
        
        float total;
        
        if((sexo.equals("F")) || (sexo.equals("f"))){
            total = (float) (preco - (preco * 0.13));
        }else{
            total = (float) (preco - (preco * 0.05));
        }
        
        System.out.println("O valor final das suas compras, após o desconto, é "+ total +".");
    }
   
}
