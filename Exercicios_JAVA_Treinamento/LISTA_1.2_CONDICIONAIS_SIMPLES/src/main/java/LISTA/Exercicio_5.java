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
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Verificador de Ano Bissexto");
        System.out.println("Informe o ano:");
        int ano = ler.nextInt();
        
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é Bissexto");
        }else{
            System.out.println("O Ano não é Bissexto");
        }
        
    }
}
