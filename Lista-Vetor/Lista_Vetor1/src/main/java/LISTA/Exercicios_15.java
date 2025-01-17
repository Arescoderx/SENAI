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
public class Exercicios_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];


        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para verificar se existe no vetor: ");
        int numero = scanner.nextInt();

        boolean existe = false;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] == numero) {
                existe = true;
                break;
            }
        }

        if (existe) {
            int[] novoVetor = new int[19];
            int j = 0;
            for (int i = 0; i < 20; i++) {
                if (vetor[i] != numero) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            System.out.println("Novo vetor (sem o número " + numero + "):");
            for (int i = 0; i < 19; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número " + numero + " não existe no vetor.");
        }

        scanner.close();
    }
}
