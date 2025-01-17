/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_12_prova;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_12_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero:" + (i + 1));
            ler = dado.readLine();
            vetor[i] = Integer.parseInt(ler);
        }

        for (int i = 9; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int troca = 0;
                    troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;

                }
            }
        }

        System.out.println("Seus Numeros Ordenados");
        for (int i = 0; i < 10; i++) {

            System.out.println(vetor[i]);
        }

        System.out.println("Digite outro numero:");
        ler = dado.readLine();
        int num = Integer.parseInt(ler);
        
        for (int i = 0; i < 9; i++) {
            
        }
    }
}
