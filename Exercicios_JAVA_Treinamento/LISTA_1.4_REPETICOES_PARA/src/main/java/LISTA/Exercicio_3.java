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
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int i =  ler.nextInt();
        
        for(int p = 0 ; p <= i; p = p+1){
            System.out.println(p+", ");
        }
        System.out.println("FIM!");
    }
}
