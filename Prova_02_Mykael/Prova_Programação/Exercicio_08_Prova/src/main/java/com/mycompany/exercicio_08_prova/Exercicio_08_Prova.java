/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_08_prova;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_08_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("DIGITE UM NUMERO PARA SABER SUA TABUADA:");
        ler = dado.readLine();
        int num = Integer.parseInt(ler);

        String mensagem = "TABUADO DE " + num + "\n";

        for (int i = 0; i <= 10; i++) {
            mensagem += num + " X " + i + " = " + (num * i) + "\n";
        }

        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Textos_Prova\\TABUADA DO " + num + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println(mensagem);
        arquivo.close();

    }
}
