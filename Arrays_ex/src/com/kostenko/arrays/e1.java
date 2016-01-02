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
public class e1 {
    public static void main(String[] args) {
        Processor p = new Processor();
        p.processArray(new BerylliumSphere [] {new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere [] bS1 = {new BerylliumSphere(), new BerylliumSphere()};
        p.processArray(bS1);
        BerylliumSphere [] bS2 = new BerylliumSphere [] {new BerylliumSphere(), new BerylliumSphere()};
        p.processArray(bS2);
    }
}

class Processor {
    public void processArray(BerylliumSphere [] bsa){
        System.out.println(Arrays.toString(bsa));
    }
}

class BerylliumSphere {
  private static long counter;
  private final long id = counter++;
  public String toString() { return "Sphere " + id; }
}