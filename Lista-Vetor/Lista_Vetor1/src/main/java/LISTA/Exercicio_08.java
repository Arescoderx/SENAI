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
public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade = 20;
        Float aluno[] = new Float[quantidade];
        Float total = 0f;
        Float media = 0f;
        int acima = 0;
        
        for(int i = 0; i <= (quantidade-1); i++){
            System.out.println("Escreva a sua Nota:");
            aluno[i] = ler.nextFloat();
            total = total + aluno[i];
        }
        media = total / quantidade;
        for(int i = 0; i <= (quantidade-1); i++){
            if(aluno[i] >= media){
                acima = acima + 1;
            }
        }
        System.out.println("A media da turma ficou em "+media+" e apenas "+acima+" alunos ficaram acima da media");
        
    }
}
