/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Pavel
 */
public class e3 {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        arrayProcessor.printArray(arrayProcessor.getArrayOfDouble(2, 4, 14, 17));
    }
}

class ArrayProcessor {
    Random rand = new Random();
    Double [] [] arrayOfDouble;
    Double [] [] getArrayOfDouble (int k, int l, int m, int n){
        int min = (m<n?m:n);
        int max = (m<n?n:m);
        arrayOfDouble = new Double [k][l];
        for (int i=0;i<k;i++){
            for (int j=0;j<l;j++){
                arrayOfDouble[i][j]=min+(max-min)*rand.nextDouble();
            }
        }
        return arrayOfDouble;
    }
    
    void printArray(Double [] [] array){
        System.out.println(Arrays.deepToString(array));
    }
}