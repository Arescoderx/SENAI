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
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o valor empréstimo?:");
        float empres = ler.nextFloat();
        
        System.out.println("Quantas Parcelas?:");
        int parcelas = ler.nextInt();
        
        float valor_parcela =(float) ((empres + empres*0.20)/parcelas);
        
        System.out.println("Você deverá pagar "+parcelas+" parcelas de "+valor_parcela);
        
    }
}
