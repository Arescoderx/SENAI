/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Exercicio_19 {

    public static void main(String[] args) throws IOException {
        int quant = quant();
        String nome[] = new String[quant];
        Float salario[] = new Float[quant];
        Float valorferias[] = new Float[quant];

        nomefuncionario(nome, quant);
        salariofuncionario(salario, quant);
        calculo(salario, quant, valorferias);
        imprimir(nome, quant, valorferias);

    }

    public static int quant() throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("QUANTOS FUNCIONARIOS VAO PARTICIPAR:");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);

        return quant;

    }

    public static void nomefuncionario(String nome[], int quant) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("INFORME O NOME DOS FUNCIONARIOS");
        for (int i = 0; i < quant; i++) {
            System.out.println("FUNCIONARIO " + (i + 1) + " :");
            System.out.print("NOME:");
            ler = dado.readLine();
            nome[i] = ler;
        }
    }

    public static void salariofuncionario(Float salario[], int quant) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("INFORME O SALARIO DOS FUNCIONARIOS");
        for (int i = 0; i < quant; i++) {
            System.out.println("FUNCIONARIO " + (i + 1) + " :");
            System.out.print("SALARIO:");
            ler = dado.readLine();
            salario[i] = Float.parseFloat(ler);
        }
    }

    public static void calculo(Float salario[], int quant, Float valorferias[]) {

        for (int i = 0; i < quant; i++) {
            valorferias[i] = salario[i] + (salario[i] / 3);
        }
    }

    public static void imprimir(String nome[], int quant, Float valorferias[]) throws IOException {
        String mensagem = "CALCULO DE FERIAS\n";
        for (int i = 0; i < quant; i++) {
            mensagem += "FUNCIONARIO " + (i + 1) + " :\n";
            mensagem += "NOME: " + nome[i] + "\n";
            mensagem += "SALARIO:" + valorferias[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Textos"+"CalculoFerias.txt");
        PrintWriter gravar = new PrintWriter (arquivo);
        gravar.print(mensagem);
    }
}
