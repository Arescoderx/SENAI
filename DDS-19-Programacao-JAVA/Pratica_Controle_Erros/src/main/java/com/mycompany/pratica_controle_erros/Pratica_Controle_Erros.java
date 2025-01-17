/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_controle_erros;

/**
 *
 * @author m.schmidt
 */
public class Pratica_Controle_Erros {

    public static void main(String[] args) {
        String valorString = "42a"; //Valor numérico como string
        
        try{
            Float valorFloat = Float.parseFloat(valorString);
            System.out.println("Valor inteiro: " + valorFloat);
        }catch(NumberFormatException e) {
            System.out.println("Erro ao converter: "+ e.getMessage());
        }
    }
}
