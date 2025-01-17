/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira o ano de nascimento:");
        int ano_nasc = ler.nextInt();
        
        System.out.println("Por favor, insira o ano atual:");
        int ano_atual = ler.nextInt();
        
        int idade = ano_atual - ano_nasc;
        
        if(idade == 18){
            System.out.println("Você deve se alistar neste ano.");
        }else if(idade < 18){
            System.out.println("Você ainda não precisa se alistar. Faltam "+(18 - idade)+" anos.");
        }else{
            System.out.println("Você já deveria ter se alistado há "+(idade - 18)+" anos.");
        }
    }
}
