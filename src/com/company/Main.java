package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //variables
        String name = "jimmy";
        String lastname = "crake";

        // Integer
        int age = 24;
        /* it has a fixed capacity, if we put 23123123123 in "integer too large" would come up */

        // Byte
        byte thisbyte = 127;
        /* (smaller allocated space than integer) byte maxes out at 127 (positive or negative)
        8 bit signed two's complement */

        // Short
        short thisshort = 260;
        /* both byte and short are used when memory saving matters
        16 bit signed two's complement */

        // Float
        float thisfloat = 3.14f;
        /* without the "f" at the end the compiler will think that the data is a double */

        // Double
        double thisdouble = 32.1090;
        /* bigger than a float, used for recurring numbers and mathematical values*/

        // Character    [ . , d e F ? ]
        char thisChar = 'A';








        /*
        Commenting out large blocks of code
        Note to self:
        - Java is cool
         */




        //System.out.println("Hello World - Java"); //println stands for print line
        //System.out.println(name);

        //Concatenation
        //System.out.println("Hi - that's " + name + " " + lastname + " age: " + age);


    }
}
