package com.ss.ita;

import com.ss.ita.util.UserName;
import com.ss.ita.util.implementation.ConsoleScanner;

public class Runner {

    UserName user;
    ConsoleScanner scanner = new ConsoleScanner();

    com.ss.ita.kata.implementation.Nnn7.EightImpl Nnn7kata8 = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
    com.ss.ita.kata.implementation.andriikapustiak.EightImpl andriikapustiakkata8 = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
    com.ss.ita.kata.implementation.khrystiash.EightImplementation khrystiashkata8 = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
    com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl kuderiavetsnatakata8 = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
    com.ss.ita.kata.implementation.nataliia0223.EightImpl nataliia0223kata8 = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
    com.ss.ita.kata.implementation.romankhvalbota.EightImpl romankhvalbotakata8 = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
    com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp vladislavshevchukkata8 = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();

    com.ss.ita.kata.implementation.Nnn7.EightImpl Nnn7 = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
    com.ss.ita.kata.implementation.andriikapustiak.EightImpl andriikapustiak = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
    com.ss.ita.kata.implementation.khrystiash.EightImplementation khrystiash = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
    com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl kuderiavetsnata = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
    com.ss.ita.kata.implementation.nataliia0223.EightImpl nataliia0223 = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
    com.ss.ita.kata.implementation.romankhvalbota.EightImpl romankhvalbota = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
    com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp vladislavshevchuk = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
    public void setImplementation(UserName user) {
        this.user = user;
    }

    public void runTask1() {
        long us = user.getId();
        System.out.println("Enter double number:");
        switch ((int)us){
            case 1:
                System.out.println(Nnn7.liters(scanner.readDouble()));
                break;
            case 2:
                andriikapustiak.liters(scanner.readDouble());
                break;
            case 3:
                khrystiash.liters(scanner.readDouble());
                break;
            case 4:
                kuderiavetsnata.liters(scanner.readDouble());
                break;
            case 5:
                nataliia0223.liters(scanner.readDouble());
                break;
            case 6:
                romankhvalbota.liters(scanner.readDouble());
                break;
            case 7:
                vladislavshevchuk.liters(scanner.readDouble());
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
    }

    public void runTask1() {
        long us = user.getId();
        System.out.println("Enter double number:");
        switch ((int)us){
            case 1:
                System.out.println(Nnn7.liters(scanner.readDouble()));
                break;
            case 2:
                andriikapustiak.liters(scanner.readDouble());
                break;
            case 3:
                khrystiash.liters(scanner.readDouble());
                break;
            case 4:
                kuderiavetsnata.liters(scanner.readDouble());
                break;
            case 5:
                nataliia0223.liters(scanner.readDouble());
                break;
            case 6:
                romankhvalbota.liters(scanner.readDouble());
                break;
            case 7:
                vladislavshevchuk.liters(scanner.readDouble());
                break;
            default:
                System.out.println("This implementation doesn`t exist!");
                break;
        }
    }
}
