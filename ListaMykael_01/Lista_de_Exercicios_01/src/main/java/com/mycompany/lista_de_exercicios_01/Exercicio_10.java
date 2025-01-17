/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;
        do {
            System.out.print("Por favor, informe quantos números reais você deseja digitar (entre 0 e 50) inteiro: ");
            n = ler.nextInt();
            if (n < 0 || n > 50) {
                System.out.println("Valor inválido! O número deve estar entre 0 e 50.");
            }
        } while (n < 0 || n > 50);

        double[] A = new double[n];

        ArrayList<Double> negativo = new ArrayList<>();
        ArrayList<Double> postivo = new ArrayList<>();

        System.out.println("Agora, por favor, digite " + n + " números reais (positivos, negativos ou zero):");

        for (int i = 0; i < n; i++) {
            System.out.println("valor "+(i+1)+":");
            A[i] = ler.nextDouble();
            if (A[i] < 0) {
                negativo.add(A[i]);
            } else {
                postivo.add(A[i]);
            }
        }

        System.out.println("números negativos que você digitou: " + negativo);
        System.out.println("Quantidade de números negativos: " + negativo.size());
        System.out.println("números positivos e zeros que você digitou: " + postivo);
        System.out.println("Quantidade de números positivos e zeros: " + postivo.size());

    }
}
