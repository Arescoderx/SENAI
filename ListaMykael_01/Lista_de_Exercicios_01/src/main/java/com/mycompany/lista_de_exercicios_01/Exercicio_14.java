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
public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdFunc;

        System.out.print("Digite a quantidade de funcionários: ");
        qtdFunc = scanner.nextInt();
        scanner.nextLine();

        float SomaSalAtual = 0;
        float SomaSalReajustado = 0;

        for (int i = 0; i < qtdFunc; i++) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário atual do funcionário: ");
            float SalAtual = scanner.nextFloat();
            scanner.nextLine();

            float SalReaj;
            
            if (SalAtual <= 150) {
                SalReaj = SalAtual * 1.25f;
            } else if (SalAtual <= 300) {
                SalReaj = SalAtual * 1.20f;
            } else if (SalAtual <= 600) {
                SalReaj = SalAtual * 1.15f;
            } else {
                SalReaj = SalAtual * 1.10f;
            }

            System.out.println("Funcionário: " + nome);
            System.out.println("Salário Atual: R$ " + SalAtual);
            System.out.println("Salário Reajustado: R$ " + SalReaj);
            System.out.println();

            SomaSalAtual += SalAtual;
            SomaSalReajustado += SalReaj;
        }

        float diferenca = SomaSalReajustado - SomaSalAtual;

        System.out.println("Soma dos Salários Atuais: R$ " + SomaSalAtual);
        System.out.println("Soma dos Salários Reajustados: R$ " + SomaSalReajustado);
        System.out.println("Diferença: R$ " + diferenca);
    }
}