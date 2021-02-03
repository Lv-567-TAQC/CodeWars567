package com.ss.ita.util.implementation;

import com.ss.ita.util.Scanner;

import java.math.BigInteger;

public class ConsoleScanner implements Scanner {
    //private final java.util.Scanner scanner;
    java.util.Scanner scan = new java.util.Scanner(System.in);

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
        int n = 0;
        System.out.print("Enter no. of elements you want in array:");
        while (true){
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                break;
            } else {
                scan.next();
                System.out.println("Incorrect array`s length. Try again...");
            }
        }
        int[] a = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            while (true){
                if (scan.hasNextInt()) {
                    a[i] = scan.nextInt();
                    break;
                } else {
                    scan.next();
                    System.out.println("Incorrect element type(int). Try again...");
                }
            }
        }
        return a;
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
        int n = 0;
        System.out.print("Enter no. of elements you want in array:");
        while (true){
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                break;
            } else {
                scan.next();
                System.out.println("Incorrect array`s length. Try again...");
            }
        }
        double[] a = new double[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            while (true){
                if (scan.hasNextDouble()) {
                    a[i] = scan.nextDouble();
                    break;
                } else {
                    scan.next();
                    System.out.println("Incorrect element type(double). Try again...");
                }
            }
        }
        return a;
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
        int n = 0;
        System.out.print("Enter no. of elements you want in array:");
        while (true){
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                break;
            } else {
                scan.next();
                System.out.println("Incorrect array`s length. Try again...");
            }
        }
        String[] a = new String[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            while (true){
                if (scan.hasNextLine()) {
                    a[i] = scan.nextLine();
                    break;
                } else {
                    scan.next();
                    System.out.println("Incorrect element type(string). Try again...");
                }
            }
        }
        return a;
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
