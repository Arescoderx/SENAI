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
public class Exercicio_09 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("ESCREVA O NOME DO LUTADOR:");
        ler = dado.readLine();
        String nome = ler;

        System.out.println("DIGITE SEU PESO:");
        ler = dado.readLine();
        float peso = Float.parseFloat(ler);

        String categoria = "";

        if (peso < 65) {
            categoria = "Pena";
        } else if ((peso >= 65) && (peso < 72)) {
            categoria = "Leve";
        } else if ((peso >= 72 && peso < 79)) {
            categoria = "Ligerio";
        } else if ((peso >= 79 && peso < 86)) {
            categoria = "Meio medio";
        } else if ((peso >= 86 && peso < 93)) {
            categoria = "Medio";
        } else if (peso >= 93 && (peso < 100)) {
            categoria = "Meio pesado";
        } else if (peso >= 100) {
            categoria = "Pesado";
        }

        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Txts\\Lutador");
        PrintWriter gravar = new PrintWriter(arquivo);

        gravar.println("O lutador " + nome + " pesa " + peso + "kg e se enquandra na categoria " + categoria);

        arquivo.close();
    }
}
