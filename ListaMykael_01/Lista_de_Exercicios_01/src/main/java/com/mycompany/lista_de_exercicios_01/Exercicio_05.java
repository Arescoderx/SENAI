/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_05 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do lutador: ");
        String nome = ler.nextLine();
        System.out.println("Digite o peso do lutador: ");
        String pesoStr = ler.nextLine();
        float peso = Float.parseFloat(pesoStr);

        String categoria;
        if (peso < 65) {
            categoria = "Pena";
        } else if (peso >= 65 && peso < 72) {
            categoria = "Leve";
        } else if (peso >= 72 && peso < 79) {
            categoria = "Ligeiro";
        } else if (peso >= 79 && peso < 86) {
            categoria = "Meio médio";
        } else if (peso >= 86 && peso < 93) {
            categoria = "Médio";
        } else if (peso >= 93 && peso < 100) {
            categoria = "Meio pesado";
        } else {
            categoria = "Pesado";
        }

        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Teste\\" + "IMC " + nome + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("Nome fornecido: " + nome + "\n");
        gravar.printf("Peso fornecido: " + peso + "\n");
        gravar.printf("O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria + ".");
 

        arquivo.close();
    }
}
