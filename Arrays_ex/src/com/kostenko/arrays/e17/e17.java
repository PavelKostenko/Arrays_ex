/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays.e17;

import java.math.BigDecimal;
import java.util.Arrays;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
/**
 *
 * @author Pavel
 */
public class e17 {
    public static class BigDecimalGenerator implements Generator<BigDecimal>{
        private int value = 0;
        public BigDecimal next(){
            return new BigDecimal(value++);
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Generated.array(BigDecimal.class, new BigDecimalGenerator(), 3)));
        System.out.println("************");
        BigDecimal[] bD = new BigDecimal[5];
        System.out.println(Arrays.toString(Generated.array(bD, new BigDecimalGenerator())));
    }
}
