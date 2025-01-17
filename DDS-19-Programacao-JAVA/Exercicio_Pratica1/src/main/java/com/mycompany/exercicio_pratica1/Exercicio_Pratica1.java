/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_pratica1;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_Pratica1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE MEDIA");
        
        System.out.println("DIGITE SUA PRIMEIRA NOTA:");
            float nota_1 = ler.nextFloat();
        
        System.out.println("DIGITE SUA SEGUNDA NOTA:");
            float nota_2 = ler.nextFloat();
        
        System.out.println("DIGITE SUA TECERIRA NOTA:");
             float nota_3 = ler.nextFloat();
        float media = (nota_1+nota_2+nota_3)/3;
        
        System.out.println("DIGITE SUA FRENQUENCIA");
            int frequencia = ler.nextInt();
            
        System.out.println("Sua Media é:"+media);
        
        if(media >=7 && frequencia >=75){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
