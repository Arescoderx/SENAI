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
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira um número inteiro:");
        int numero = ler.nextInt();
        
        int vericador = numero % 2;
        
        if(vericador == 0){
            System.out.println("O número "+numero+" é PAR.");
        }else{
            System.out.println("O número "+numero+" é ÍMPAR.");
        }
    }
}