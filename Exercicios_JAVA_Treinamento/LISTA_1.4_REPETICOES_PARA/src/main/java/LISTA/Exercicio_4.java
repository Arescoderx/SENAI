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
        
        System.out.println("Digite um valor:");
        int valor = ler.nextInt();
        
        int tabu = 0;
        
        for(int i = 1; i <= 10; i++){
            tabu = valor*i;
            System.out.println(valor+" X "+i+" = "+tabu);
        }
    }
}
