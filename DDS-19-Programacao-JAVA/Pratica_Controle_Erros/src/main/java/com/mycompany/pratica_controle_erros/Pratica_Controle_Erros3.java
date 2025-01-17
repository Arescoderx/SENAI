/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica_controle_erros;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Pratica_Controle_Erros3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] numeros = {10,20,30,40,50};
        
        System.out.println("Digite um indice (0-4):");
        int indice = ler.nextInt();
        
        try{
            System.out.println("Valor no indece "+ indice +" "+numeros[indice]);
            
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Indice fora do intervalo.");
        }
        
        ler.close();
    }
}
