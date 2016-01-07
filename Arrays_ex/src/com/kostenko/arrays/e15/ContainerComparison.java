package com.kostenko.arrays.e15;

//: arrays/ContainerComparison.java
import java.util.*;
import static net.mindview.util.Print.*;
import net.mindview.util.Generated;
import net.mindview.util.Generator;

class BerylliumSphereGenerator implements Generator <BerylliumSphere> {
    public BerylliumSphere next(){
        return new BerylliumSphere();
    }
}

public class ContainerComparison {

    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
//        for (int i = 0; i < 5; i++) {
//            spheres[i] = new BerylliumSphere();
//        }
        spheres = Generated.array(spheres, new BerylliumSphereGenerator());
        print(Arrays.toString(spheres));
        print(spheres[4]);

//        List<BerylliumSphere> sphereList
//                = new ArrayList<BerylliumSphere>();
//        
//        for (int i = 0; i < 5; i++) {
//            sphereList.add(new BerylliumSphere());
//        }
        
        Class cl = BerylliumSphere.class;
        List<BerylliumSphere> sphereList
                = Arrays.asList(Generated.array(cl,new BerylliumSphereGenerator(),5));
        
        print(sphereList);
        print(sphereList.get(4));

        int[] integers = {0, 1, 2, 3, 4, 5};
        print(Arrays.toString(integers));
        print(integers[4]);

        List<Integer> intList = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        print(intList);
        print(intList.get(4));
    }
} /* Output:
 [Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4, null, null, null, null, null]
 Sphere 4
 [Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9]
 Sphere 9
 [0, 1, 2, 3, 4, 5]
 4
 [0, 1, 2, 3, 4, 5, 97]
 4
 *///:~
