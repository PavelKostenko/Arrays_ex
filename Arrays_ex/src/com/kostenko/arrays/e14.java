/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays;

import java.util.Arrays;
import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;
import net.mindview.util.Generator;

/**
 *
 * @author Pavel
 */
public class e14 {
    public static void main(String[] args) {
        int [] ints;
        float [] floats;
        double [] doubles;
        boolean [] booleans;
        char [] chars;
        String [] strings;
        byte [] bytes;
        short [] shorts;
        long [] longs;
        
        ints = ConvertTo.primitive(Generated.array(Integer.class, new CountingGenerator.Integer(), 5));
        floats = ConvertTo.primitive(Generated.array(Float.class, new CountingGenerator.Float(), 5));
        doubles = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 5));
        booleans = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 5));
        chars = ConvertTo.primitive(Generated.array(Character.class, new CountingGenerator.Character(), 5));
        strings = Generated.array(String.class, new CountingGenerator.String(), 5);
        bytes = ConvertTo.primitive(Generated.array(Byte.class, new CountingGenerator.Byte(), 5));
        shorts = ConvertTo.primitive(Generated.array(Short.class, new CountingGenerator.Short(), 5));
        longs = ConvertTo.primitive(Generated.array(Long.class, new CountingGenerator.Long(), 5));
        
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(floats));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(shorts));
        System.out.println(Arrays.toString(longs));
    }
}
