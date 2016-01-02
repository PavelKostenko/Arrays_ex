/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.arrays;

/**
 *
 * @author Pavel
 */
public class e8 {
    public static void main(String[] args) {
        ArrayOfGenericType<String> array = new ArrayOfGenericType<String>(5);
        array.array[2]="test";
        //array.array[3]=new BerylliumSphere();
        ArrayOfGenericType<Object> array1 = new ArrayOfGenericType<Object>(3);
        array1.array[1]="test";
        array1.array[2]=new BerylliumSphere();
    }
}

class ArrayOfGenericType<T> {

    T[] array; // OK

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
//! array = new T[size]; // Illegal
        array = (T[]) new Object[size]; // "unchecked" Warning
    }
// Illegal:
//! public <U> U[] makeArray() { return new U[10]; }
}
