/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva o ano atual:");
        int ano_atual = ler.nextInt();
        
        System.out.println("Escreva o seu ano de nascimento:");
        int ano_nascimento = ler.nextInt();
        
        int idade = ano_atual - ano_nascimento;
        
        if(idade >= 18){
            System.out.println("Você tem "+ idade +" é obrigada a votar");
        }else if(idade == 17){
            System.out.println("Você tem "+ idade +" pode votar se quiser");
        }else if (idade < 17){
            System.out.println("Você tem "+ idade +" não pode votar");
        }
    }
}
