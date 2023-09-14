/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvetor;

/**
 *
 * @author alexandre.9930
 */
public class filtragempares {
    public static void main(String args[]){
    
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    
    int contPares = 0;
    for(int i = 0; i < nums.length; i++){
    
        if(nums[i] % 2 == 0){
           contPares++;
        }
       }
      int[] pares = new int[contPares];
      int contParesPos = 0;
      for(int i = 0;i < nums.length; i ++){
          if(nums[i] % 2 == 0){
            pares[contParesPos] = nums[i]; 
            contParesPos++;
        }
      }
      for(int i = 0; i < pares.length; i++){
          System.out.println(pares[i]);
      }
    }
  }
