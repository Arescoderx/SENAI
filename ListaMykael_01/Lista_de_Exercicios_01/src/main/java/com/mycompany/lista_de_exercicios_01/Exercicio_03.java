/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_01;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (;;) {
            System.out.println("Digite o primeiro número: ");
            int num1 = ler.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = ler.nextInt();

            if ((num1 < 0 && num2 < 0) || (num1 >= 0 && num2 >= 0)) {
                int resultado = num1 + num2;
                System.out.println("Soma de " + num1 + " com " + num2 + " = " + resultado);
                break;
            }
            else{
                System.out.println("Dados de Entrada são Inválidos: os números têm sinais diferentes");
            }
        }
    }
}
