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
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        float num = ler.nextFloat();
        
        System.out.println("O dobro de "+num+" é "+(num*2));
        
        System.out.println("A terça parte de"+num+"é"+(num/3));
    }
}
