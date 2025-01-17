/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_recuperacao_mykael;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_03 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int expresso = 0;
        int capuccino = 0;
        int leite_cafe = 0;
        float total = 0;

        for(;;) {
            System.out.println("Escolha uma opcao");
            System.out.println("1 - café expresso");
            System.out.println("2 - café capuccino");
            System.out.println("3 - leite com café");
            System.out.println("4 - totalizar vendas");
            ler = dado.readLine();
            int escolha = Integer.parseInt(ler);

            if (escolha == 1) {
                expresso = expresso + 1;
                System.out.println("ESCOLHA ANOTADA!");
            } else if (escolha == 2) {
                capuccino = capuccino + 1;
                System.out.println("ESCOLHA ANOTADA!");
            } else if (escolha == 3) {
                leite_cafe = leite_cafe + 1;
                System.out.println("ESCOLHA ANOTADA!");
            }

            if (escolha == 4) {
                break;
            }
        }

        total = (float) ((expresso * 0.75) + (capuccino * 1.0) + (leite_cafe * 1.25));

        String mensagem = "MAQUINA DE CAFÉ\n";
        mensagem += expresso + " café expresso, VALOR: " + (expresso * 0.75) + "\n";
        mensagem += capuccino + " café capuccino, VALOR: " + (capuccino * 1.0) + "\n";
        mensagem += leite_cafe + " leite com café, VALOR: " + (leite_cafe * 1.25) + "\n";
        mensagem += (expresso + capuccino + leite_cafe) + " Cafés, VALOR: " + total + "\n";

        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Txts\\maquinadecafe");
        PrintWriter gravar = new PrintWriter(arquivo);

        gravar.print(mensagem);
        gravar.close();
        arquivo.close();
    }
}
