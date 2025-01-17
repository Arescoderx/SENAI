/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_09_prova;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_09_Prova {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);
        
        System.out.print("Digite quanto o funcionario ganha por hora:");
        ler = dado.readLine();
        Float salario_hora = Float.parseFloat(ler);
        
        System.out.print("Digite o número de horas trabalhadas no mês:");
        ler = dado.readLine();
        int hora = Integer.parseInt(ler);
        
        float salario_bruto = salario_hora * hora;
        float imposto = (float) (salario_bruto * 0.11);
        float INSS = (float) (salario_bruto * 0.08);
        float sindicato = (float) (salario_bruto * 0.05);
        float salario_liquido = salario_bruto - (imposto + INSS + sindicato);
        
        System.out.println("+ Salario Bruto: R$ "+salario_bruto);
        System.out.println("- Imposto de Renda (11%): R$ "+imposto);
        System.out.println("- INSS (8%): R$ "+ INSS);
        System.out.println("- Sindicato (5%): R$ "+sindicato);
        System.out.println("= Salario Liquido: R$ "+salario_liquido);
    }
}
