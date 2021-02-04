package com.ss.ita;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.UserName;
import com.ss.ita.util.implementation.ConsoleScanner;

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
}
