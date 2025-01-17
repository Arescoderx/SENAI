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
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num[] = new float[10];
        
        for(int i = 0; i <= 9; i++){
            System.out.println("Informe um numero que forneceremos a matede dele:");
            num[i] = ler.nextFloat()/2;   
            
        }
        for(int i = 0; i <= 9; i++){
            System.out.println(num[i]);
        }
    }
}
