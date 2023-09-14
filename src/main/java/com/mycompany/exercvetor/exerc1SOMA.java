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
public class exerc1SOMA {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[6];
        int soma = 0;
        
        numeros[0] = 2;
        numeros[1] = 8;
        numeros[2] = 22;
        numeros[3] = 32;
        numeros[4] = 26;
        numeros[5] = 72;
        
        
        for(int i = 0; i < numeros.length; i++){
            
            soma = soma + numeros[i];
            
        
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
