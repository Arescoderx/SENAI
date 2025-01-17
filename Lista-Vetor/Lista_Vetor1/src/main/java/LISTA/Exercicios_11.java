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
public class Exercicios_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] M = new int[10];
        int X;

        System.out.println("Digite 10 números para o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor que vai ser multiplicado a sequencia de numeros: ");
        X = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Resultado da multiplicação dos elementos digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Multiplicando " + A[i] + " x " + X + " = " + M[i]);
        }

        scanner.close();

    }
}
