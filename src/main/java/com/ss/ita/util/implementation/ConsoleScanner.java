package com.ss.ita.util.implementation;

import com.ss.ita.util.Scanner;

import java.math.BigInteger;

public class ConsoleScanner implements Scanner {
    private final java.util.Scanner scan;
    public ConsoleScanner(){
        scan = new java.util.Scanner(System.in);
    }

    @Override
    public int readInt() {
        while(true){
            if (scan.hasNextInt()) {
                return scan.nextInt();
            } else {
                scan.next();
                System.out.println("Incorrect format(integer). Try again...");
            }
        }
    }

    @Override
    public long readLong() {
        while(true){
            if (scan.hasNextLong()) {
                return scan.nextLong();
            } else {
                scan.next();
                System.out.println("Incorrect format(long). Try again...");
            }
        }
    }

    @Override
    public int[] readIntArray() {
        while(true){
            if(scan.hasNextLine()){
                String str = scan.nextLine();
                String[] elements = str.trim().split("\\s+");
                int[] intArray = new int[elements.length];
                try{
                    for (int i = 0; i < intArray.length; i++) {
                        intArray[i]=Integer.parseInt(elements[i]);
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Incorrect type of array(int). Try again...");
                    continue;
                }
                return  intArray;
            }
        }
    }

    @Override
    public float readFloat() {
        while(true){
            if (scan.hasNextFloat()) {
                return scan.nextFloat();
            } else {
                scan.next();
                System.out.println("Incorrect format(float). Try again...");
            }
        }
    }

    @Override
    public double readDouble() {
        while(true){
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            } else {
                scan.next();
                System.out.println("Incorrect format(double). Try again...");
            }
        }
    }

    @Override
    public double[] readDoubleArray() {
        while(true){
            if(scan.hasNextLine()){
                String str = scan.nextLine();
                String[] elements = str.trim().split("\\s+");
                double[] doubleArray = new double[elements.length];
                try{
                    for (int i = 0; i < doubleArray.length; i++) {
                        doubleArray[i]=Double.parseDouble(elements[i]);
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Incorrect type of array(double). Try again...");
                    continue;
                }
                return  doubleArray;
            }
        }
    }

    @Override
    public String readString() {
        while(true){
            if (scan.hasNextLine()) {
                return scan.nextLine();
            } else {
                scan.next();
                System.out.println("Incorrect format(string). Try again...");
            }
        }
    }

    @Override
    public String[] readStringArray() {
        while(true){
            if(scan.hasNextLine()){
                String str = scan.nextLine();
                String[] stringArray = str.trim().split("\\t");
                return  stringArray;
            }
        }
    }

    @Override
    public BigInteger readBigInt() {
        while(true){
            if (scan.hasNextBigInteger()) {
                return scan.nextBigInteger();
            } else {
                scan.next();
                System.out.println("Incorrect format(big integer). Try again...");
            }
        }
    }
}
