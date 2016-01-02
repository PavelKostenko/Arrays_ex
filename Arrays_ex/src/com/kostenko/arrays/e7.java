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
public class e7 {
    static BerylliumSphere [][][] getArray(int k, int l, int m){
        BerylliumSphere [] [] [] array = new BerylliumSphere[k][l][m];
        for (int i = 0; i<k; i++){
            for (int j= 0; j<l;j++){
                for (int h =0; h<m;h++){
                    array[i][j][h] = new BerylliumSphere();
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getArray(2,4,3)));
    }
}
