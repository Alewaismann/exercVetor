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
public class exercVetorValorespares {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[2];
        
        int par = 0, impar = 0;
        
        nums[0] = 3;
        nums[1] = 2;
        
        for(int i = 0; i < nums.length; i++){
        if (nums[i] % 2 == 0){
        par = nums[i];
        }else if(nums[i] % 2 != 0){
        impar = nums[i];
        }
        
        }System.out.println(" O numero " + par + " é PAR, e " + impar + " é Impar ");
    
    }
}
