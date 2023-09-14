/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;



/**
 *
 * @author alexandre.9930
 */
public class exercVetorMaiorMenor {
    public static void main(String args){
     
        int[] nums = new int[5];
         
         
         nums[0] = 7;
         nums[1] = 10;
         nums[2] = 13;
         nums[3] = 33;
         nums[4] = 31;
         
         int maior = nums[0];
         
         for(int i = 0; i < nums.length; i++){
           if(nums[i] > maior){
              maior = nums[i];
                 
           } 
         } 
         System.out.println("o numero maior é: " + maior);
    }
}
 