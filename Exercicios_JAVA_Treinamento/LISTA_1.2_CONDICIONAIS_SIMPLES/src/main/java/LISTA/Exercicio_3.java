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
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, insira o nome do aluno:");
        String nome = ler.nextLine();
        
        System.out.println("Insira a primeira nota do aluno:");
        float nota_um = ler.nextFloat();
                
        System.out.println("Insira a segunda nota do aluno:");
        float nota_dois = ler.nextFloat();
        
        float media = (nota_um + nota_dois)/2;
        
        System.out.println("A média do aluno "+nome+" é "+media+".");
        
        if(media >= 7){
            System.out.println("Você teve um bom aproveitamento.");
        }else{
            System.out.println("Infelizmente sua média está abaixo do esperado. Você precisa melhorar.");
        }
    }
}
