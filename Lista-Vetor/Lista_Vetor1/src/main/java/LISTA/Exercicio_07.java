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
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome[] = new String[10];
        
        for(int i = 0; i <= 9; i++){
            System.out.println("Escreva um nome:");
            nome[i] = ler.nextLine();
        }
        System.out.println("Escreva o nome da pessoa que vc quer achar:");
        String achar = ler.nextLine();
        
        for(int i = 0; i <= 9; i++){
            if(nome[i].equals(achar)){
                System.out.println("Achei a pessoa na "+(i+1)+" coluna");
                break;
            }else{
                if(i == 9){
                    System.out.println("Não Achei");
                }
            }
        }
    }
}
