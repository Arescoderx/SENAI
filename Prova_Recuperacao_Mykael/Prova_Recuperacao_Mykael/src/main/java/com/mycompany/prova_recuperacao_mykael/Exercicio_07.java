/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_recuperacao_mykael;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_07 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);
        int quant = 0;
        String pistas[] = new String[5];

        System.out.print("Jogador 1 - Digite seu nome:");
        ler = dado.readLine();
        String nome = ler;

        System.out.print(nome + " - Digite o nome do filme:");
        ler = dado.readLine();
        String filme = ler;

        for (int i = 1; i <= 5; i++) {
            System.out.print(nome + " - Digite a pista " + i + ":");
            ler = dado.readLine();
            pistas[(i - 1)] = ler;
        }

        System.out.print("Jogador 2 - Digite seu nome:");
        ler = dado.readLine();
        String nome2 = ler;

        System.out.print(nome2 + ", a pista 1 é: " + pistas[0] + "\n");
        System.out.print(nome2 + " Qual o nome do filme?");
        ler = dado.readLine();
        String resposta = ler;

        if (resposta.equals(filme)) {
            System.out.println(nome2 + " VOCE ACERTOU");

        } else {
            System.out.println(nome2 + " VOCE ERROU");

            for (;;) {

                quant = quant + 1;

                if (quant < 5) {
                    System.out.println(nome2 + ", a pista " + (quant + 1) + " é: " + pistas[quant]);

                } else if (quant == 5) {
                    System.out.println(nome2 + " VOCE PERDEU");
                    break;
                } else {
                    System.out.println("Tente Novamente:");
                }
                System.out.print(nome2 + " Qual o nome do filme?");
                ler = dado.readLine();
                resposta = ler;

                if (resposta.equals(filme)) {
                    System.out.println(nome2 + " VOCE ACERTOU");
                    break;
                } else {
                    System.out.println(nome2 + " VOCE ERROU");
                }
            }
        }
    }
}
