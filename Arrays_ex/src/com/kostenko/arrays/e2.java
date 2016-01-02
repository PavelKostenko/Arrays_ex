/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays;

import java.util.Arrays;

/**
 *
 * @author Pavel
 */
public class e2 {
    static BerylliumSphere [] getArray (int n){
        BerylliumSphere[] bsa = new BerylliumSphere[n];
        for (int i = 0; i<n; i++){
            bsa[i] = new BerylliumSphere();
        }
        return bsa;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(7)));
    }
}
