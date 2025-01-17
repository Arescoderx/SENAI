/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

/**
 *
 * @author mathe
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        int num[] = new int[51];
        
        for(int i = 1; i <= 50;i++){
            num[i] = 2 * i;
        }
        
        for(int i = 1; i <= 50;i++){
            System.out.println(num[i]);
        }
    }
}
