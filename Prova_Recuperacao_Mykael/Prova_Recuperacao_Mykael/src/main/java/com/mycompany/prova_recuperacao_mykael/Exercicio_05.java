/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_recuperacao_mykael;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_05 {

    public static void main(String[] args) throws IOException {
        DataInputStream dado = new DataInputStream(System.in);
        String ler = "";

        int cod = 1234, senha = 9999;

        for (;;) {
            System.out.println("Digite o codigo do usuario");
            ler = dado.readLine();
            int tentcod = Integer.parseInt(ler);
            if (tentcod == cod) {
                break;
            } else {
                System.out.println("Usuário inválido!");
            }
        }
        
        for (;;) {
            System.out.println("Digite a senha do usuario:");
            ler = dado.readLine();
            int tentsenha = Integer.parseInt(ler);
            if (tentsenha == senha) {
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("senha incorreta");
            }
        }
    }
}
