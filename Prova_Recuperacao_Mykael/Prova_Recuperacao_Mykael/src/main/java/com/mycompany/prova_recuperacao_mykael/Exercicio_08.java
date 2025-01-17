/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_recuperacao_mykael;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_08 {

    public static void main(String[] args) throws IOException {
        DataInputStream dado = new DataInputStream(System.in);
        String ler = "";
        float num = 0;

        System.out.println("Escreva um numero para descobrir a tabuada:");
        ler = dado.readLine();
        num = Integer.parseInt(ler);

        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Txts\\Tabuada do "+num);
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println("-----------------------");
        gravar.println("TABUADO DE " + num + "\n");
        for (int i = 1; i <= 10; i++) {
            gravar.println(num + " * " + i + " = " + (num*i));
        }
        gravar.println("-----------------------");
        
        arquivo.close();
        gravar.close();
    }
}
