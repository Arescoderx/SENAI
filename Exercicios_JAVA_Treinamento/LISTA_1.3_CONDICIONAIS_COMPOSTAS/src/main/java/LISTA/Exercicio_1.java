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
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor:");
        int vu = ler.nextInt();
        
        System.out.println("Insira o Segundo valor:");
        int vd = ler.nextInt();
        
        if(vd == vu){
            System.out.println("Não existe valor maior, os dois são iguais");
        }else if(vu > vd){
            System.out.println("O primeiro valor é o maior");
        }else if(vu < vd){
            System.out.println("O segundo valor é o maior");
        }
    }
}
