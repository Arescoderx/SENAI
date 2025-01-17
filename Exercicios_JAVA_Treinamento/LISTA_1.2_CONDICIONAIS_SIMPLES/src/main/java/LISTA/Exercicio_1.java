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
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int limite = 80;
        
        System.out.println("Escreva a velocidade do seu carro:");
        int velocidade = ler.nextInt();
        
        if(limite > velocidade){
            float multa = (float) (limite - velocidade) * 5;
            
            System.out.println("Você foi multado em:"+multa);
        }else{
            System.out.println("Você não foi multado");
        }
    }
}
