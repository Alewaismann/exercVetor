/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;

/**
 *
 * @author alexandre.9930
 */
public class exercVetorMEDIA {
   public static void main(String args[]){
   
       
       float[] nums = new float[3];
       float soma = 0, resultado;
       nums[0] = 8;
       nums[1] = 9;
       nums[2] = 48;
        
       for(int i = 0; i < nums.length; i++){
       
           soma = soma + nums[i];
           
       
       }resultado = soma / nums.length;
       System.out.println(resultado);
   } 
}
