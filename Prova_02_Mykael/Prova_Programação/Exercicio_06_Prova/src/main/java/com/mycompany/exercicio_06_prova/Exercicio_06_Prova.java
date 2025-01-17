/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_06_prova;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_06_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);
        int n = 0;
        int soma = 0;
        int quant = 0;
        float media = (float) 0;
        
        for (;;) {
            
            System.out.println("Digite um numero: (0 - Sair)");
            ler = dado.readLine();
            n = Integer.parseInt(ler);
            
            soma = soma + n;
            if(n == 0){
                break;
            }
            quant = quant + 1;
        }
        media = soma / quant;
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("A media dos numero: "+media);
        System.out.println("A soma dos numero: "+soma);
        System.out.println("A quantidade digitada: "+quant);
    }
}
