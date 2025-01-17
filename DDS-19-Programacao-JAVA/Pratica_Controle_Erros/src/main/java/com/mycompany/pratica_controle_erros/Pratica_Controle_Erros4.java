/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica_controle_erros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Pratica_Controle_Erros4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[4];

        System.out.println("Informe os números. O primeiro é o número e o segundo é o divisor.");

        for (int i = 0; i <= 3; i += 2) {
            for (;;) {
                System.out.println("Primeiro número:");
                try {
                    num[i] = Integer.parseInt(ler.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
                }
            }

            for (;;) {
                System.out.println("Segundo número (divisor):");
                try {
                    num[i + 1] = Integer.parseInt(ler.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
                }
            }
        }
        
        for (int i = 0; i <= 3; i = i + 2) {
            try {
                int resultado = (num[i] / num[i + 1]);
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisao por zero");
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter: " + e.getMessage());
            }

        }

        ler.close();
    }
}
