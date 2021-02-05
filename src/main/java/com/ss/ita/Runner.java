package com.ss.ita;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.UserName;
import com.ss.ita.util.implementation.ConsoleScanner;

import java.math.BigInteger;

public class Runner {

    UserName user;
    ConsoleScanner scanner = new ConsoleScanner();
    Eight eight;
    Seven seven;
    Six six;
    Five five;

    public void setImplementation(UserName user) {
        this.user = user;
        switch (user) {
            case NNN7:
                eight = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
                seven = new com.ss.ita.kata.implementation.Nnn7.SevenImpl();
                //   six = new com.ss.ita.kata.implementation.Nnn7.SixImpl();
                //   five = new com.ss.ita.kata.implementation.Nnn7.FiveImpl();
                break;
            case ANDRIIKAPUSTIAK:
                eight = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
                seven = new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl();
                six = new com.ss.ita.kata.implementation.andriikapustiak.SixImpl();
                five = new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl();
                break;
            case KHRYSTIASH:
                eight = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
                seven = new com.ss.ita.kata.implementation.khrystiash.SevenImplementation();
                six = new com.ss.ita.kata.implementation.khrystiash.SixImplementation();
                five = new com.ss.ita.kata.implementation.khrystiash.FiveImplementation();
                break;
            case KUDERIAVETSNATA:
                eight = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
                seven = new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl();
                six = new com.ss.ita.kata.implementation.kuderiavetsnata.SixImpl();
                // five = new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl();
                break;
            case NATALIAA0223:
                eight = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
                seven = new com.ss.ita.kata.implementation.nataliia0223.SevenImpl();
                six = new com.ss.ita.kata.implementation.nataliia0223.SixImpl();
                five = new com.ss.ita.kata.implementation.nataliia0223.FiveImpl();
                break;
            case ROMANKHVALBOTA:
                eight = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
                seven = new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl();
                six = new com.ss.ita.kata.implementation.romankhvalbota.SixImpl();
                //      five = new com.ss.ita.kata.implementation.romankhvalbota.FiveImpl();
                break;
            case VLADISLAVSHEVCHUK:
                eight = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
                seven = new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp();
                six = new com.ss.ita.kata.implementation.vladislavshevhcuk.SixImp();
                five = new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp();
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
    }

    public void runTask1() {
        System.out.println("Running Keep Hydrated:");
        System.out.println("Enter double number:");
        double input = scanner.readDouble();
        String res = String.valueOf(eight.liters(input));
        System.out.println(res);
    }

    public void runTask2() {
        System.out.println("Running Volume of cuboid:");
        System.out.println("Enter double number length:");
        double length = scanner.readDouble();
        System.out.println("Enter double number width:");
        double width = scanner.readDouble();
        System.out.println("Enter double number high:");
        double high = scanner.readDouble();
        String res = String.valueOf(eight.getVolumeOfCuboid(length, width, high));
        System.out.println(res);
    }

    public void runTask3() {
        System.out.println("Running Miles per gallon to kilometers per liter:");
        System.out.println("Enter float number:");
        float input = scanner.readFloat();
        String res = String.valueOf(eight.mpgToKPM(input));
        System.out.println(res);
    }

    public void runTask4() {
        System.out.println("To Square Root Or Not To Square Root:");
        System.out.println("Enter array of integers:");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(eight.squareOrSquareRoot(input));
        System.out.println(res);
    }

    public void runTask5() {
        System.out.println("Count Of Positives Sum Of Negatives :");
        System.out.println("Enter array of integers:");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(eight.countPositivesSumNegatives(input));
        System.out.println(res);
    }

    public void runTask6() {
        System.out.println("Convert A String To A Number");
        System.out.println("Enter a string:");
        String input = scanner.readString();
        String res = String.valueOf(eight.stringToNumber(input));
        System.out.println(res);
    }

    public void runTask7(){
        System.out.println("Wilson Primes");
        System.out.println("Enter double number:");
        double input = scanner.readDouble();
        String res = String.valueOf(eight.amIWilson(input));
        System.out.println(res);
    }

    public void runTask8(){
        System.out.println("Formatting decimal places:");
        System.out.println("Enter double number:");
        double input = scanner.readDouble();
        String res = String.valueOf(eight.twoDecimalPlaces(input));
        System.out.println(res);
    }

    public void runTask9(){
        System.out.println("Find numbers which are divisible by given number:");
        System.out.println("Enter int:");
        int inputInt = scanner.readInt();
        System.out.println("Enter array of integers:");
        int [] inputArrInt = scanner.readIntArray();
        String res = String.valueOf(eight.divisibleBy(inputArrInt, inputInt));
        System.out.println(res);
    }

    public void runTask10() {
        System.out.println("Running Looking for a benefactor:");
        System.out.println("Enter double array of donations:");
        double[] donations = scanner.readDoubleArray();
        System.out.println("Enter int desired average number:");
        int average = scanner.readInt();
        String res = String.valueOf(seven.newAvg(donations,average));
        System.out.println(res);
    }

    public void runTask11() {
        System.out.println("Running Sum of the first nth term of Series:");
        System.out.println("Enter int count of series numbers:");
        int count = scanner.readInt();
        String res = String.valueOf(seven.seriesSum(count));
        System.out.println(res);
    }


    public void runTask12() {
        System.out.println("Running Where is Vasya:");
        System.out.println("Enter int number:");
        int p = scanner.readInt();
        System.out.println("Enter int before number:");
        int bef = scanner.readInt();
        System.out.println("Enter int after number:");
        int aft = scanner.readInt();
        String res = String.valueOf(seven.whereIsHe(p,bef,aft));
        System.out.println(res);
    }

    public void runTask13() {
        System.out.println("Running Build a pile of Cubes:");
        System.out.println("Enter long number:");
        long input = scanner.readLong();
        String res = String.valueOf(six.findNb(input));
        System.out.println(res);
    }

    public void runTask14() {
        System.out.println("Running Easy Balance Checking:");
        System.out.println("Enter string:");
        String input = scanner.readString();
        String res = String.valueOf(six.balance(input));
        System.out.println(res);
    }

    public void runTask15() {
        System.out.println("Running Floating-point Approximation:");
        System.out.println("Enter double number:");
        double input = scanner.readDouble();
        String res = String.valueOf(six.f(input));
        System.out.println(res);
    }

    public void runTask16() {
        System.out.println("Running Rainfall:");
        System.out.println("Enter a string (town):");
        String town = scanner.readString();
        System.out.println("Enter a string:");
        String input = scanner.readString();
        String res1 = String.valueOf(six.mean(town, input));
        String res2 = String.valueOf(six.variance(town, input));
        System.out.println(res1 + "\n" + res2);
    }

    public void runTask17() {
        System.out.println("Running Ranking NBA:");
        System.out.println("Enter a string (resultSheet):");
        String resultSheet = scanner.readString();
        System.out.println("Enter a string (What do you want to find?):");
        String input = scanner.readString();
        String res = String.valueOf(six.nbaCup(resultSheet, input));
        System.out.println(res);
    }

    public void runTask18() {
        System.out.println("Running Help the Bookseller!:");
        System.out.println("Enter stock list:");
        String[] lstOfArt = scanner.readStringArray();
        System.out.println("Enter list of categories:");
        String[] lstOf1stLetter = scanner.readStringArray();
        String res = String.valueOf(six.stockSummary(lstOfArt, lstOf1stLetter));
        System.out.println(res);
    }

    public void runTask19() {
        System.out.println("Running Artificial Rain:");
        System.out.println("Enter array of integers:");
        int [] inputArrInt = scanner.readIntArray();
        String res = String.valueOf(five.artificialRain(inputArrInt));
        System.out.println(res);
    }

    public void runTask20() {
        System.out.println("Running Gap in Primes:");
        System.out.println("Enter (integer >= 2) which indicates the gap we are looking for:");
        int gap = scanner.readInt();
        System.out.println("Enter (integer > 2) which gives the start of the search (m inclusive)");
        int start = scanner.readInt();
        System.out.println("Enter (integer >= m) which gives the end of the search (n inclusive)");
        int end = scanner.readInt();
        String res = String.valueOf(five.gap(gap, start, end));
        System.out.println(res);
    }

    public void runTask21() {
        System.out.println("Running Trailing zeros in factorial:");
        System.out.println("Enter int number which will be under factorial:");
        int number = scanner.readInt();
        String res = String.valueOf(five.zeros(number));
        System.out.println(res);
    }

    public void runTask22(){
        System.out.println("Perimeter of squares in a rectangle:");
        System.out.println("Enter (Biginteger >=0) which will be number of squares -1:");
        BigInteger number = scanner.readBigInt();
        String res = String.valueOf(five.perimeter(number));
        System.out.println(res);
    }

    public void runTask23(){
        System.out.println("Which x for that sum?:");
        System.out.println("Enter (double >=0) which will be sum of numerical series");
        double number = scanner.readDouble();
        String res = String.valueOf(five.solveSum(number));
        System.out.println(res);
    }

    public void runTask24(){
        System.out.println("Find the smallest:");
        System.out.println("Enter long number in which the digits will be rearranged to find the smallest number can get:");
        long number = scanner.readLong();
        String res = String.valueOf(five.smallest(number));
        System.out.println(res);
    }
}
