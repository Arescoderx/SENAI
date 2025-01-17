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
public class Exercicio_15 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem " + idade + " anos.");
    }
}
