/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

/**
 *
 * @author mathe
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        int num[] = new int[20];
        
        for(int i = 1; i <= 20; i = i+2){
            num[i] = (int) Math.pow(i,2);
        }
        
        for(int i = 1; i <=20; i = i+2){
            System.out.println(num[i]);
        }
    }
}
