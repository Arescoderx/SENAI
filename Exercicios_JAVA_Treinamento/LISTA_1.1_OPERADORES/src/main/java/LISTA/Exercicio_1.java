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
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int valor_um = ler.nextInt();
        
        System.out.println("Digite outro valor:");
        int valor_dois = ler.nextInt();
        
        int total = valor_um + valor_dois;
                
        System.out.println("A soma entre " + valor_um + " e " + valor_dois + " é igual a" + total);
    }
}
