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

/**
 *
 * @author Pavel
 */
public class e12 {
    public static void main(String[] args) {
        double [] dArray = new double[3];
        net.mindview.util.CountingGenerator.Double dl = new net.mindview.util.CountingGenerator.Double();
        for (int i=0; i<3; i++){
            dArray[i]=dl.next();
        }
        System.out.println(Arrays.toString(dArray));
        //OR
        double [] dArray2 = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 5));
        System.out.println(Arrays.toString(dArray2));
        
    }
}
