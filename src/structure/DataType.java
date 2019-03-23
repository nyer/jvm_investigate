package structure;

import java.util.ArrayList;
import java.util.List;

public class DataType {

    public static void main(String[] args) {

        // primitive types
        byte b = 23; // 8 bit signed two's-complement integers, default value is zero

        short s = 23; // 16 bit signed two's-complement integers, default value is zero

        int i = 23; // 32 bit signed two's-complement integers

        long l = 23; // 64 bit signed two's-complement integers

        char c = 3; // 16 bit unsigned integers representing Unicode code points, encoded with UTF-16

        float f = 3f; // whose values are elements of the float value set or, where supported, float-extended-exponent value set,
                      // and whose default value is positive zero.

        double d = 3d; // whose values are elements of the double value set or, where supported, double-extended-exponent value set,
                      // and whose default value is positive zero.

        boolean bool = false; //  true or false values, default value is false. with limited support from jvm, there are no
        // jvm instructions solely dedicated to operations on boolean values.  Instead, expressions that operate on boolean values
        // are compiled to use values of int data type where using 1 represent to true , 0 represent to false.
        // but jvm does directly support boolean arrays including boolean array creation, accession and modification.
        // in oracle jvm implementation, boolean arrays are encoded as byte arrays, using 8 bits per boolean element.

        // returnAddress type are pointers to opcodes of Java Virtual Machine instructions. it is not directly associated with language type.

        // reference types
        Object object = new Object(); // object reference

        Object[] objArray = new Object[3]; // array reference, where component type is Object.
        Object[][] objarray2 = new Object[1][1];// component type of an array type may itself be an array type.
        // in this case, Object is the element type of array type.
        // element type is either a primitive type, or a class type, or an interface type.

        List<String> list = new ArrayList<>(); // interface reference

        Object nullObj = null; // reference value may also be the special null reference
        // which initially has no run-time type, but may be cast to any type.
        // default value of a reference type is null.
    }
}
