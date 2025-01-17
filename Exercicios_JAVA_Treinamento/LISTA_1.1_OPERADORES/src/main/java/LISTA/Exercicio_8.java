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
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantas dias você trabalha por mês:?");
        int mes = ler.nextInt();
        
        int valor_pago = mes*(8*25);
        
        System.out.println("Seu salario sera:"+valor_pago);
    }
}
