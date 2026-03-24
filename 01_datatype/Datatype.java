// Write a program to print size (in bytes) of all primitive data types (int, float, double, char, etc.) 

package datatype;

public class Datatype {
    public static void main (String args[]){
        System.out.println("Size (in bytes) of all primitive data types");
        System.out.println("int: " + Integer.BYTES);
        System.out.println("double: " + Double.BYTES);
        System.out.println("float: " + Float.BYTES);
        System.out.println("long: " + Long.BYTES);
        System.out.println("short: " + Short.BYTES);
        System.out.println("byte: " + Byte.BYTES);
        System.out.println("char: " + Character.BYTES);



    }
    
}
