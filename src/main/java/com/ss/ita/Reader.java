package com.ss.ita;


import java.math.BigInteger;
import java.util.Scanner;

public class Reader {
    public int readKey(int first, int last) {
        Scanner scan = new Scanner(System.in);
        try {
            int key = scan.nextInt();
            if (key >= first && key <= last) {
                return key;
            }
        } catch (Exception e) {
            System.out.println("Введіть ціле позитивне число!");
        }
        System.out.println("Введіть число з наявних!");
        return readKey(first, last);
    }

    public String readString() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //зчитує рядок
        if (str == null) { //в деяких авданнях рядок може бути null за умовою, тому повертає його
            return str;
        }
        while (!str.contains("\t")) { //в даному випадку сигнал про кінець рядка є знак табуляції+ентр (зчитує в один рядок все що після)
            str += " " + scan.nextLine();//перестворюєм рядок з ентерами в норм рядок і додаєм пробіл після знаку ентера (щоб два слова з сусідніх рядків не злились )
        }
        if (!(str.matches("^[a-zA-Z0-9[.][ ][:][\n][\t]]+"))) {//все що може містити рядок (в одному завданні він має містити пробіли, тому \n то ок
            System.out.println("Введіть рядок коректно!");//якщо зчитаний рядок містить щось інше ніж в блоці if просить заново ввести рядок
            return readString();
        }
        return str;
    }

    public BigInteger readBigInteger() {
        Scanner scan = new Scanner(System.in);
        try {
            BigInteger bigInteger = scan.nextBigInteger();
            return bigInteger;
        } catch (Exception e) {
            System.out.println("Неправильний формат данних! Спробуйте ще раз!");
        }
        return readBigInteger();
    }

    public BigInteger readBigIntegerV2() {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextBigInteger()) {
            return scan.nextBigInteger();
        }
        System.out.println("Неправильний формат данних! Спробуйте ще раз!");
        return readBigIntegerV2();
    }

    public int[] readArrayInt()
    {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        s.close();
        return a;
    }

    public int readInt()
    {
        return 0;
    }

    public long readLong()
    {
        return 0;
    }

    public double[] readArrayDouble() {
        Scanner scan = new Scanner(System.in);
        int length = -900;

        System.out.println("Enter the length of the array:");

        if (scan.hasNextInt()) {
            length = scan.nextInt();
            if (length < 0) {
                System.out.println("Number schould be bigger than 0");
            } else {
                System.out.println(length + " elements:");
            }
        } else {
            System.out.println("This is not a number");
        }

        if (length > 0) {
            System.out.print("Enter your array of doubles:");
            double[] doubleArray = new double[length];
            for (int i = 0; i < length; i++) {
                if (scan.hasNextDouble()) {
                    doubleArray[i] = scan.nextDouble();
                } else {
                    System.out.println("This is not a double");
                    length = -900;
                    break;
                }
            }
            scan.close();
            return doubleArray;
        }

        if (length < 0) {
            System.out.println("Wrong input! Try again!");
            scan.close();
            readArrayDouble();
        }

        scan.close();
        return null;
    }

    public double readDouble() {
        System.out.println("Введіть число з комою: ");
        Scanner scan = new Scanner(System.in);
        double number = 0;
        if (scan.hasNextDouble()) {
            number = scan.nextDouble();
        } else {
            System.out.println("Ви ввели не число!");
            return readDouble();
        }
        return number;
    }

    public float readFloat() {
        System.out.println("Введіть число: ");
        Scanner scan = new Scanner(System.in);
        float number = 0;
        if (scan.hasNextFloat()) {
            number = scan.nextFloat();
        } else {
            System.out.println("Неправильний ввід!");
            return readFloat();
        }
        return number;
    }

    public String[] readArrayString() {
        String[] a = {};
        return a;
    }
}
