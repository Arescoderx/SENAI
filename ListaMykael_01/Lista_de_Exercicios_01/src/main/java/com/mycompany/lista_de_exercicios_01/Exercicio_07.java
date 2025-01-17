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
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int quantidade = 0;
        int soma = 0;
        float media;

        System.out.println("Digite um número inteiro positivo (ou zero/valor negativo para encerrar): ");
        int num = ler.nextInt();

        if (num >= 1) {
            maior = num;
            menor = num;
            soma = num;
            quantidade = 1;
        }

        while (num >= 1) {
            System.out.println("Digite outro número inteiro positivo (ou zero/valor negativo para encerrar): ");
            num = ler.nextInt();
            if (num >= 1) {
                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
                soma += num;
                quantidade++;
            }
        }

        if (quantidade > 0) {
            media = (float) soma / quantidade;
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
            System.out.println("Quantidade de valores informados: " + quantidade);
            System.out.println("Soma dos valores informados: " + soma);
            System.out.println("Média dos valores informados: " + media);
        } else {
            System.out.println("Nenhum número positivo foi informado.");
        }

        ler.close();
    }
}