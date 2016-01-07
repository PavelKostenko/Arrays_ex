/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

/**
 *
 * @author Pavel
 */
public class e13 {
    public static void main(String[] args) {
        Character [] cArray = Generated.array(Character.class, new CountingGenerator.Character(), 5);
        String a = new String(ConvertTo.primitive(cArray));
        System.out.println(a);

    }
}
