/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

/**
 *
 * @author mathe
 */
public class Exercicio_02 {
    public static void main(String[] args) {
        int num[] = new int[101];
        
        for(int i = 100; i >= 1; i--){
            num[i] = i;
        }
        
        for(int i = 1; i <= 100; i++){
            System.out.println(num[i]);
            
        }
    }
}
