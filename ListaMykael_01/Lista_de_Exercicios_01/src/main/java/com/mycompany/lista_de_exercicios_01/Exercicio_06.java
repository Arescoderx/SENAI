/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_01;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro (0 para sair):");
        int x  = ler.nextInt();
        
        while (x != 0) {
            if (x > 0) {
                System.out.println("O número " + x + " é positivo.");
                
            } else if (x < 0) {
                System.out.println("O número " + x + " é negativo.");
            }
            
            System.out.println("Digite outro número inteiro (0 para sair):");
            x = ler.nextInt();
        }

    }
}
