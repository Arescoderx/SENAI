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
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Em que ano você está?:");
        int ano_atual = ler.nextInt();
        
        System.out.println("Em que ano você nasceu:");
        int ano_nas = ler.nextInt();
        
        int idade = ano_atual - ano_nas;
        
        System.out.println("Sua idade será:"+idade);
    }
}
