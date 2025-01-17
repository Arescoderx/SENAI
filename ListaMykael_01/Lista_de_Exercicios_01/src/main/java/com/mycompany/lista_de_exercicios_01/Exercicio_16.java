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
public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int numeroFuncionarios = scanner.nextInt();

        float[] salarios = new float[numeroFuncionarios];
        float soma = 0;

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextFloat();
            soma = soma + salarios[i];
        }

        float media = soma / numeroFuncionarios;
        System.out.println("Salário médio: R$ " + media);

        int contadorAcimaMedia = 0;
        for (int i = 0; i < numeroFuncionarios; i++) {
            if (salarios[i] > media) {
                contadorAcimaMedia++;
            }
        }
        System.out.println("Número de funcionários que ganham acima da média: " + contadorAcimaMedia);
    }
}
