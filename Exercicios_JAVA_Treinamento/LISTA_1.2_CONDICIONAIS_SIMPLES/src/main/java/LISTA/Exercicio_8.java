/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
8) Faça um algoritmo que leia a distância que um passageiro deseja percorrer em Km.
Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas
*/

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual é a distancia você deseja percorrer em Km:");
        int Km = ler.nextInt();
        
        float preco;
                
        if(Km >= 200){
            preco = Km * 0.5f;
        }else{
            preco = Km * 0.45f;
        }
        
        System.out.println("Sua viajem custara "+preco+" reais");
    }
}
