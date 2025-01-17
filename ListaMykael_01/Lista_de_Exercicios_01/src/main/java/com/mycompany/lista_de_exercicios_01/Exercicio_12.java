/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int n;
        do {
            System.out.print("Por favor, informe o número de elementos (entre 0 e 50): ");
            n = ler.nextInt();
        } while (n < 0 || n > 50);

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = random.nextInt(100);
        }

        System.out.print("valores no vetor: ");
        for (int valor : v) {
            System.out.print(valor + " ");
        }
        System.out.println();

        int x;
        System.out.print("Digite um número inteiro para remover do vetor (ou -1 para sair): ");
        x = ler.nextInt();

        while (x != -1) {
            int[] novovetor = new int[n];
            int contador = 0;

            for (int i = 0; i < v.length; i++) {
                if (v[i] != x) {
                    novovetor[contador++] = v[i];
                }
            }

            int[] vFinal = new int[contador];
            for (int i = 0; i < contador; i++) {
                vFinal[i] = novovetor[i];
            }

            System.out.print("vetor após remover " + x + ": ");
            for (int valor : vFinal) {
                System.out.print(valor + " ");
            }
            System.out.println();

            System.out.print("Digite um número inteiro para remover do vetor (ou -1 para sair): ");
            x = ler.nextInt();
        }

    }
}