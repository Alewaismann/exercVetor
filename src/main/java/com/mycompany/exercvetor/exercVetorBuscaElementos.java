/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;

/**
 *
 * @author alexandre.9930
 */
public class exercVetorBuscaElementos {
   public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int elementoBuscado = 30;
        
        int posicao = buscarElemento(vetor, elementoBuscado);
        
        if (posicao != -1) {
            System.out.println("O elemento " + elementoBuscado + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O elemento " + elementoBuscado + " não foi encontrado no vetor.");
        }
    }
    
    public static int buscarElemento(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}


