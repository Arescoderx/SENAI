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
public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int troca = 0;
        int x = 0;
        int total = 0;
        int quantidade = 0;

        System.out.println("Digite o valor de Min: ");
        int min = ler.nextInt();

        System.out.println("Digite o valor de Max: ");
        int max = ler.nextInt();

        if (min > max) {
            System.out.println(" Min é maior que Max. Os valores serão invertidos.");
            troca = min;
            min = max;
            max = troca;
        }

        do {
            System.out.println("Digite um número inteiro (ou 0 para encerrar): ");
            x = ler.nextInt();

            if (x != 0) {
                if (x >= min && x <= max) {
                    total = total + x;
                    quantidade++;
                } else {
                    System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
                }
            }
        } while (x != 0);

        System.out.println("Total de valores no intervalo [" + min + ", " + max + "]: " + total);
        System.out.println("Quantidade de valores no intervalo [" + min + ", " + max + "]: " + quantidade);
    }
}
