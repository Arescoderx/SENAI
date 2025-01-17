/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_15_txt;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author m.schmidt
 */
public class PROJETO_15_TXT {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entra;
        int[] tabu = new int[5];
        DataInputStream dado;

        System.out.println("Informe 5 numeros para fazermos a tabuada de cada um:");
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.println("Valor"+(i+1)+":");
                    dado = new DataInputStream(System.in);
                    tabu[i] = Integer.parseInt(entra = dado.readLine());
                    break;
                } catch (Exception e) {
                        System.out.println("Você inseriu um valor errado");
                }
            }
        }

        for (int i = 0; i < 5; i++) {

            FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\TESTE\\" + "Tabuado do " + tabu[i] + ".txt");
            PrintWriter gravar = new PrintWriter(arquivo);

            gravar.printf("Tabuada do " + tabu[i] + "\n");
            gravar.printf("------------------");

            for (int n = 1; n <= 10; n++) {
                gravar.printf("\n" + n + " x " + tabu[i] + " = " + (n * tabu[i]) + "\n");
            }

            arquivo.close();
        }

    }
}
