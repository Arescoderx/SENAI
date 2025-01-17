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
public class Exercicios_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DIAS_NO_ANO = 365;

        float[] temperaturas = new float[DIAS_NO_ANO];

        System.out.println("Digite a temperatura média de cada dia do ano:");
        for (int i = 0; i < DIAS_NO_ANO; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextFloat();
        }

        float menorTemperatura = temperaturas[0];
        float maiorTemperatura = temperaturas[0];
        float somaTemperaturas = 0;
        int diasAbaixoDaMedia = 0;

        for (int i = 0; i < DIAS_NO_ANO; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
            somaTemperaturas += temperaturas[i];
        }

        float mediaAnual = somaTemperaturas / DIAS_NO_ANO;

        for (int i = 0; i < DIAS_NO_ANO; i++) {
            if (temperaturas[i] < mediaAnual) {
                diasAbaixoDaMedia++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + diasAbaixoDaMedia);

        scanner.close();
    }
}
