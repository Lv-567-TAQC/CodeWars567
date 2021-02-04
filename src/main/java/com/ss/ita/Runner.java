package com.ss.ita;

import com.ss.ita.kata.Eight;
import com.ss.ita.util.UserName;
import com.ss.ita.util.implementation.ConsoleScanner;

public class Runner {

    UserName user;
    ConsoleScanner scanner = new ConsoleScanner();
    Eight eight;


    public void setImplementation(UserName user) {
        this.user = user;
    }

    public void runTask1() {
        long us = user.getId();
        System.out.println("Enter double number:");
        switch ((int) us) {
            case 1:
                eight = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
                break;
            case 2:
                eight = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
                break;
            case 3:
                eight = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
                break;
            case 4:
                eight = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
                break;
            case 5:
                eight = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
                break;
            case 6:
                eight = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
                break;
            case 7:
                eight = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
        System.out.println(eight.liters(scanner.readDouble()));
    }

    public void runTask2() {
        long us = user.getId();
        System.out.println("Enter double number 3 times:");
        switch ((int) us) {
            case 1:
                eight = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
                break;
            case 2:
                eight = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
                break;
            case 3:
                eight = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
                break;
            case 4:
                eight = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
                break;
            case 5:
                eight = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
                break;
            case 6:
                eight = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
                break;
            case 7:
                eight = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
        System.out.println(eight.getVolumeOfCuboid(scanner.readDouble(), scanner.readDouble(),scanner.readDouble()));
    }

    public void runTask3() {
        long us = user.getId();
        System.out.println("Enter float number:");
        switch ((int) us) {
            case 1:
                eight = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
                break;
            case 2:
                eight = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
                break;
            case 3:
                eight = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
                break;
            case 4:
                eight = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
                break;
            case 5:
                eight = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
                break;
            case 6:
                eight = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
                break;
            case 7:
                eight = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
        System.out.println(eight.mpgToKPM(scanner.readFloat()));
    }
}
