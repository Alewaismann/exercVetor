/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;

import java.util.Scanner;



/**
 *
 * @author alexandre.9930
 */
public class exercVetorInversao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da lista de números: ");
        int tamanho = scanner.nextInt();
        
        int[] numeros = new int[tamanho];
        
        System.out.println("Digite os números um por um: ");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }
        
       
        int[] numerosInvertidos = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            numerosInvertidos[i] = numeros[tamanho - 1 - i];
        }
        
        System.out.println("Lista de números original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(numeros[i] + " ");
        }
        
        System.out.println("Lista de números invertida: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(numerosInvertidos[i] + " ");
        }
      }
   }
   
   
