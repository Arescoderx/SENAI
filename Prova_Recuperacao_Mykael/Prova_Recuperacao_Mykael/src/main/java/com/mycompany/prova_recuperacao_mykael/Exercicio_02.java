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
public class Exercicio_02 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado = new DataInputStream(System.in);
        String ler = "";
        
        System.out.println("Escreva sua idade\nanos:(quantos anos ja passou)");
        ler = dado.readLine();
        int anos = Integer.parseInt(ler);
        
        System.out.println("Meses:(quantos meses ja passou)");
        ler = dado.readLine();
        int meses = Integer.parseInt(ler);
        
        System.out.println("Dias:(qual dia do mes voce ta)");
        ler = dado.readLine();
        int dias = Integer.parseInt(ler);
        
        float resultado = (anos * 365) + (meses * 30) + dias;
        
        System.out.println(anos + " anos," + meses + " meses e " + dias + " dias = " + resultado + " dias");
        
        
        
        
        
        
    }
}
