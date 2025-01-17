/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_02_prova;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_02_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Insira a sua Idade");
        System.out.println("Anos:");
        ler = dado.readLine();
        int anos = Integer.parseInt(ler);

        System.out.println("Meses:");
        ler = dado.readLine();
        int meses = Integer.parseInt(ler);

        System.out.println("Dias:");
        ler = dado.readLine();
        int dias = Integer.parseInt(ler);

        int total = dias + (meses * 30) + (anos * 365);

        System.out.println(anos + " anos," + meses + " meses e " + dias + " dias = " + total + " dias");

    }
}
