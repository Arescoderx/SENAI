/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author mathe
 */
public class Exercicio_17 {
    public static void main(String[] args) throws IOException {
        String[] informacoes = informacoes();
        
        String nome = informacoes[0];
        int idade = Integer.parseInt(informacoes[1]);
        String email = informacoes[2];
        
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        
    }
        public static String[] informacoes() throws IOException {
        String[] dados = new String[3];
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("CADASTRANDO FUNCIONARIO:");
        System.out.print("NOME: ");
        dados[0] = dado.readLine();

        System.out.print("IDADE: ");
        dados[1] = dado.readLine();

        System.out.print("E-MAIL: ");
        dados[2] = dado.readLine();

        return dados;
    }
    public static void imprimir (String[] args) throws IOException {
        

    }
}
