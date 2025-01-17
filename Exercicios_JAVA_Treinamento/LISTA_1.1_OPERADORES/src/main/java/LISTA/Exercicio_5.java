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
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quanto dinheiro você tem na carteira(em R$):");
        float carteira = ler.nextFloat();
        
        float dollar = (float) (carteira/3.45);
        System.out.println("Você pode comprar essa quantidade em dollar:"+dollar);
    }
}
