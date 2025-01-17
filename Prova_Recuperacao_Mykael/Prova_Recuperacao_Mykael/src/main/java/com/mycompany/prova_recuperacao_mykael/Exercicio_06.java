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
public class Exercicio_06 {

    public static void main(String[] args) throws IOException {
        DataInputStream dado = new DataInputStream(System.in);
        String ler = "";
        int quant = 0;
        int soma = 0;
        for (;;) {

            System.out.println("Digite um numero: (0 - Para parar)");
            ler = dado.readLine();
            int num = Integer.parseInt(ler);

            if (num == 0) {
                break;
            }

            quant = quant + 1;
            soma = soma + num;
        }
        float media  = soma/quant;
        
        System.out.println("Quantidade de numeros digitados: "+quant);
        System.out.println("Soma dos numeros digitados: "+soma);
        System.out.println("Media dos numeros digitados: "+media);
        
    }
}
