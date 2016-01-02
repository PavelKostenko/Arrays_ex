/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays.e4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Pavel
 */
public class e4 {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        arrayProcessor.printArray(arrayProcessor.getArrayOfDouble(2, 4, 3, 14, 17));
    }
}

class ArrayProcessor {
    Random rand = new Random();
    Double [] [] [] arrayOfDouble;
    Double [] [] [] getArrayOfDouble (int k, int l, int o, int m, int n){
        int min = (m<n?m:n);
        int max = (m<n?n:m);
        arrayOfDouble = new Double [k][l][o];
        for (int i=0;i<k;i++){
            for (int j=0;j<l;j++){
                for (int h =0;h<o;h++){
                    arrayOfDouble[i][j][h]=min+(max-min)*rand.nextDouble();
                }
            }
        }
        return arrayOfDouble;
    }
    
    void printArray(Double [] [] [] array){
        System.out.println(Arrays.deepToString(array));
    }
}