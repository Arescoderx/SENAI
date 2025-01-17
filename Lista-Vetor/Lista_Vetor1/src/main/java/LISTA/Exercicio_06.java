/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA;

/**
 *
 * @author mathe
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        int[] V = {5, 1, 4, 2, 7, 8, 3, 6};

        for (int i = 8; i >= 5; i--) {
            int aux = V[i];
            V[i] = V[8 - i + 1];
            V[8 - i + 1] = aux;
        }

        V[3] = V[1];
        V[V[3]] = V[V[2]];

        System.out.print("Vetor final: ");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
    }
}
