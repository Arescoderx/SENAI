/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_10_prova;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_10_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite quantos produtos deseja cadastras:");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);

        String nome_prod[] = new String[quant];
        Float valor_prod[] = new Float[quant];

        for (int i = 0; i < quant; i++) {

            System.out.println("PRODUTO: " + (i + 1));
            System.out.println("Insira o nome do produto:");
            ler = dado.readLine();
            nome_prod[i] = ler;

            System.out.println("Insira o valor do produto");
            ler = dado.readLine();
            valor_prod[i] = Float.parseFloat(ler);

            System.out.println("PRODUTO CADASTRADO!!!!");
        }
        String mensagem = "PRODUTOS CADASTRADOS\n";
        mensagem += "------------------------\n";
        for (int i = 0; i < quant; i++) {
            mensagem += "Produto " + (i + 1) +"\n";
            mensagem += "Nome: " + nome_prod[i] + "\n";
            mensagem += "Valor:" + valor_prod[i] + "\n";
            mensagem += "------------------------\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Textos_Prova\\CadastroProdutos.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(mensagem);
        arquivo.close();
        

    }
}
