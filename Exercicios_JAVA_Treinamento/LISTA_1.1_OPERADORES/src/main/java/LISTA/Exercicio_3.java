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
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
        System.out.println("Digite um número:");
        int ant = ler.nextInt();
        
        System.out.println("O antecessor de "+ ant + " é "+ (ant-1));
        System.out.println("O secessor de "+ ant + " é "+ (ant+1));
        
    }
}
