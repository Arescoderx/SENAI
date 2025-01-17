/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nota 1:");
        float nota_um = ler.nextFloat();
    
        System.out.println("Nota 2:");
        float nota_dois = ler.nextFloat();
        
        float media = (nota_um + nota_dois) / 2;
                
        System.out.println("A média entre " + nota_um + " e " + nota_dois + " é igual a" + media);
    }
    
}
