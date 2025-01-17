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
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        float lado1 = ler.nextFloat();

        System.out.println("Digite o segundo lado: ");
        float lado2 = ler.nextFloat();

        System.out.println("Digite o terceiro lado: ");
        float lado3 = ler.nextFloat();

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Os números fornecidos não formam um triângulo: a soma de dois lados é menor ou igual ao terceiro lado.");

        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os números fornecidos formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado2) {
                System.out.println("Os números fornecidos formam um triângulo isósceles.");
            } else {
                System.out.println("Os números fornecidos formam um triângulo escaleno.");
            }
        }
    }
}
