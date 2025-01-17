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
public class Exercicio_18 {

    public static void main(String[] args) throws IOException {

        float salarioporhora = salario();
        int horas = horas();
        float salariobruto = 0;
        float impostoderenda = 0;
        float inss = 0;
        float sindicato = 0;
        float liquido = 0;

        salariobruto = horas * salarioporhora;
        impostoderenda = (float) (salariobruto * 0.11);
        inss = (float) (salariobruto * 0.08);
        sindicato = (float) (salariobruto * 0.05);
        liquido = salariobruto - (impostoderenda + inss + sindicato);

        imprimir(salariobruto, impostoderenda, inss, sindicato, liquido);
    }

    public static float salario() throws IOException {

        float salario = (float) 0;
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite Quanto o funcionario ganha por hora:");
        ler = dado.readLine();
        salario = Float.parseFloat(ler);

        return salario;

    }

    public static int horas() throws IOException {

        int horas = 0;
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite o numero de horas trabalhadas no mes.");
        ler = dado.readLine();
        horas = Integer.parseInt(ler);

        return horas;

    }

    public static void imprimir(float salariobruto, float impostoderenda, float inss, float sindicato, float liquido) throws IOException {
        String mensagem = "SALARIO DO FUNCIONARIO\n";
        mensagem += "SALARIO BRUTO:" + salariobruto + "\n";
        mensagem += "IMPOSTO DE RENDA (11%):" + impostoderenda + "\n";
        mensagem += "INSS (8%):" + inss + "\n";
        mensagem += "SINDICATO (5%):" + sindicato + "\n";
        mensagem += "Salario Liquido:" + liquido + "\n";

        JOptionPane.showMessageDialog(null, mensagem);
        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Textos\\" + "SalarioFuncionario.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(mensagem);
    }
}
