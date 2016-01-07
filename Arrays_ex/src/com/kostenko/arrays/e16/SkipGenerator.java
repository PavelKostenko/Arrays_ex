//: net/mindview/util/CountingGenerator.java
// Simple generator implementations.
package com.kostenko.arrays.e16;

import net.mindview.util.*;

public class SkipGenerator {

    public static class Boolean implements Generator<java.lang.Boolean> {
        public Boolean(int n){
            i = n;
        }
        private boolean value = false;
        private int i;
        public java.lang.Boolean next() {
            for(int j = 0; j<i; j++){
                value = !value;
            }
             // Just flips back and forth
            return value;
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        public Byte (int n){
            i=n;
        }
        private byte value = 0;
        private int i;
        
        public java.lang.Byte next() {
            value = (byte)(value + i);
            return value;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz"
            + "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class Character implements Generator<java.lang.Character> {
        public Character (){
            i=1;
        }
        public Character (int n){
            i=n;
        }
        int index = -1;
        private int i;
        
        public java.lang.Character next() {
            index = (index + i) % chars.length;
            return chars[index];
        }
    }

    public static class String implements Generator<java.lang.String> {
        private int length = 7;
        Generator<java.lang.Character> cg = new Character();

        public String() {
        }

        public String(int length) {
            this.length = length;
        }

        public java.lang.String next() {
            char[] buf = new char[length];
            for (int i = 0; i < length; i++) {
                buf[i] = cg.next();
            }
            return new java.lang.String(buf);
        }
    }

    public static class Short implements Generator<java.lang.Short> {
        public Short(int n){
            i=n;
        }
        private short value = 0;
        private int i;
        public java.lang.Short next() {
            return value=(short)(value+i);
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {
        public Integer (int n){
            i=n;
        }
        private int value = 0;
        private int i;
        public java.lang.Integer next() {
            return value=value+i;
        }
    }

    public static class Long implements Generator<java.lang.Long> {
        public Long (int n){
            i = n;
        }
        private long value = 0;
        private int i;
        
        public java.lang.Long next() {
            return value=(long)(value+i);
        }
    }

    public static class Float implements Generator<java.lang.Float> {
        public Float (int n){
            i=n;
        }
        private float value = 0;
        private int i;
        public java.lang.Float next() {
            float result = value;
            value = value + i;
            return result;
        }
    }

    public static class Double implements Generator<java.lang.Double> {
        public Double (int n){
            i=n;
        }
        private double value = 0.0;
        private int i;
        public java.lang.Double next() {
            double result = value;
            value += i;
            return result;
        }
    }
} ///:~
