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
public class Exercicios_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] Q = new float[20];

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite um valor positivo para a posição " + (i + 1) + ": ");
                Q[i] = scanner.nextFloat();
            } while (Q[i] <= 0);
        }

        float maiorValor = Q[0];
        int posMaior = 0;

        for (int i = 1; i < 20; i++) {
            if (Q[i] > maiorValor) {
                maiorValor = Q[i];
                posMaior = i;
            }
        }

        System.out.println("Maior valor: " + maiorValor + " na posição " + (posMaior + 1));
        scanner.close();
    }
}