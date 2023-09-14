/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;

/**
 *
 * @author alexandre.9930
 */
public class exercVetorOrdenar {
    public static void main(String[] args) {
        int[] lista = {64, 25, 12, 22, 11};

        System.out.println("Lista original:");
        imprimirLista(lista);

        ordenarPorSelecao(lista);

        System.out.println("Lista ordenada:");
        imprimirLista(lista);
    }

    public static void ordenarPorSelecao(int[] lista) {
        int tamanho = lista.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (lista[j] < lista[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
 
            int temp = lista[indiceMinimo];
            lista[indiceMinimo] = lista[i];
            lista[i] = temp;
        }
    }

    public static void imprimirLista(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
  }

