/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_05_prova;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_05_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int codigo_usuario = 1234;
        int senha = 9999;
        int passou = 0;
        for (;;) {

            System.out.println("Digite o código de usuário:");
            ler = dado.readLine();
            int tentativa = Integer.parseInt(ler);

            if (tentativa == codigo_usuario) {

                System.out.println("Agora Digite sua Senha:");
                ler = dado.readLine();
                int tentativa_senha = Integer.parseInt(ler);

                if (tentativa_senha == senha) {
                    System.out.println("Acesso permitido");
                    passou = 1;
                    break;

                } else {
                    System.out.println("senha incorreta!");
                }

            } else if (passou == 1) {
                break;
            } else {
                System.out.println("Usuário inválido!");
            }
        }
        System.out.println("LOGADO COM SUCESSO");

    }
}
