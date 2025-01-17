/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica_controle_erros;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Pratica_Controle_Erros2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        
        System.out.println("Digite um divisor: ");
        int divisor = ler.nextInt();
        
        try{
            int resultado = numero / divisor;
            System.out.println("Resultado " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisao por zero");
        }
        
        ler.close();
    }
}
