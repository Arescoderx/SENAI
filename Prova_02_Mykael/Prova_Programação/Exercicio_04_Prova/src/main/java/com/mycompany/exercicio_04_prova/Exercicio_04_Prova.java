/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_04_prova;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_04_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);
        System.out.println("Digite um numero para saber seu sucessor e antecessor:");
        ler = dado.readLine();
        int num = Integer.parseInt(ler);
        
        String mensagem = (num-1)+"Seu Antecessor\n";
        mensagem += (num+1)+"Seu Sucessor";
        
        
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
