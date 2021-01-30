package com.ss.ita;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    public Reader reader = new Reader();

    public void menu() {
        Map<Integer, String> avtory = new HashMap<Integer, String>();
        avtory.put(1, "Nnn7");
        avtory.put(2, "andriikapustiak");
        avtory.put(3, "khrystiash");
        avtory.put(4, "kuderiavetsnata");
        avtory.put(5, "nataliia0223");
        avtory.put(6, "romankhvalbota");
        avtory.put(7, "vladislavshevchuk");
        avtory.forEach((avtoryKey, avtoryValue) ->
                System.out.println(avtoryKey + " - " + avtoryValue));
        System.out.println("Оберіть автора: ");
        int avtoryKey = reader.readKey(1, avtory.size());
        System.out.println("Ви обрали: ");
        System.out.println(avtory.get(avtoryKey));

        Map<Integer, String> method = new HashMap<Integer, String>();
        method.put(1, "Kata: Eight, Method: liters");
        method.put(2, "Kata: Eight, Method: getVolumeOfCuboid");
        method.put(3, "Kata: Eight, Method: mpgToKPM");
        method.put(4, "Kata: Eight, Method: squareOrSquareRoot");
        method.put(5, "Kata: Eight, Method: countPositivesSumNegatives");
        method.put(6, "Kata: Eight, Method: stringToNumber");
        method.put(7, "Kata: Eight, Method: amIWilson");
        method.put(8, "Kata: Eight, Method: twoDecimalPlaces");
        method.put(9, "Kata: Eight, Method: divisibleBy");
        method.put(10, "Kata: Seven, Method: newAvg");
        method.put(11, "Kata: Seven, Method: seriesSum");
        method.put(12, "Kata: Seven, Method: whereIsHe");
        method.put(13, "Kata: Six, Method: findNb");
        method.put(15, "Kata: Six, Method: balance");
        method.put(16, "Kata: Six, Method: f");
        method.put(17, "Kata: Six, Method: mean/variance");
        method.put(18, "Kata: Six, Method: nbaCup");
        method.put(19, "Kata: Six, Method: stockSummary");
        method.put(20, "Kata: Five, Method: artificialRain");
        method.put(21, "Kata: Five, Method: gap");
        method.put(22, "Kata: Five, Method: zeros");
        method.put(23, "Kata: Five, Method: perimeter");
        method.put(24, "Kata: Five, Method: solveSum");
        method.put(25, "Kata: Five, Method: smallest");
        method.forEach((methodKey, methodValue) ->
                System.out.println(methodKey + " - " + methodValue));
        System.out.println("Оберіть кату: ");
        int methodKey = reader.readKey(1, method.size());
        System.out.println("Ви обрали: ");
        System.out.println(method.get(methodKey));

        String avtor = avtory.get(avtoryKey);
        String meth = method.get(methodKey);

        if (meth.contains("Eight")) {
            Eight eight;
            if (avtor.contains("Nnn7")) {
                eight = new com.ss.ita.kata.implementation.Nnn7.EightImpl();
            } else if (avtor.contains("andriikapustiak")) {
                eight = new com.ss.ita.kata.implementation.andriikapustiak.EightImpl();
            } else if (avtor.contains("khrystiash")) {
                eight = new com.ss.ita.kata.implementation.khrystiash.EightImplementation();
            } else if (avtor.contains("kuderiavetsnata")) {
                eight = new com.ss.ita.kata.implementation.kuderiavetsnata.EightImpl();
            } else if (avtor.contains("nataliia0223")) {
                eight = new com.ss.ita.kata.implementation.nataliia0223.EightImpl();
            } else if (avtor.contains("romankhvalbota")) {
                eight = new com.ss.ita.kata.implementation.romankhvalbota.EightImpl();
            } else if (avtor.contains("vladislavshevchuk")) {
                eight = new com.ss.ita.kata.implementation.vladislavshevhcuk.EightImp();
            } else {
                System.out.println("Немає такого автора чи кати");
                return;
            }

            if (meth.contains("liters")) {
                System.out.println(eight.liters(reader.readDouble()));
            } else if (meth.contains("getVolumeOfCuboid")) {
                System.out.println(eight.getVolumeOfCuboid(reader.readDouble(),reader.readDouble(),reader.readDouble()));
            } else if (meth.contains("mpgToKPM")) {
                System.out.println(eight.mpgToKPM(reader.readFloat()));
            } else if (meth.contains("squareOrSquareRoot")) {
                System.out.println(Arrays.toString(eight.squareOrSquareRoot(reader.readArrayInt())));
            } else if (meth.contains("countPositivesSumNegatives")) {
                System.out.println(Arrays.toString(eight.countPositivesSumNegatives(reader.readArrayInt())));
            } else if (meth.contains("stringToNumber")) {
                System.out.println(eight.stringToNumber(reader.readString()));
            } else if (meth.contains("amIWilson")) {
                System.out.println(eight.amIWilson(reader.readDouble()));
            } else if (meth.contains("twoDecimalPlaces")) {
                System.out.println(eight.twoDecimalPlaces(reader.readDouble()));
            } else if (meth.contains("divisibleBy")) {
                System.out.println(Arrays.toString(eight.divisibleBy(reader.readArrayInt(), reader.readInt())));
            } else {
                System.out.println("Немає такого метода");
            }
        } else if (meth.contains("Seven")) {
            Seven seven;
            if (avtor.contains("Nnn7")) {
                seven = new com.ss.ita.kata.implementation.Nnn7.SevenImpl();
            } else if (avtor.contains("andriikapustiak")) {
                seven = new com.ss.ita.kata.implementation.andriikapustiak.SevenImpl();
            } else if (avtor.contains("khrystiash")) {
                seven = new com.ss.ita.kata.implementation.khrystiash.SevenImplementation();
            } else if (avtor.contains("kuderiavetsnata")) {
                seven = new com.ss.ita.kata.implementation.kuderiavetsnata.SevenImpl();
            } else if (avtor.contains("nataliia0223")) {
                seven = new com.ss.ita.kata.implementation.nataliia0223.SevenImpl();
            } else if (avtor.contains("romankhvalbota")) {
                seven = new com.ss.ita.kata.implementation.romankhvalbota.SevenImpl();
            } else if (avtor.contains("vladislavshevchuk")) {
                seven = new com.ss.ita.kata.implementation.vladislavshevhcuk.SevenImp();
            } else {
                System.out.println("Немає такого автора чи кати");
                return;
            }

            if (meth.contains("newAvg")) {
                System.out.println(seven.newAvg(reader.readArrayDouble(),reader.readDouble()));
            } else if (meth.contains("seriesSum")) {
                System.out.println(seven.seriesSum(reader.readInt()));
            } else if (meth.contains("whereIsHe")) {
                System.out.println(seven.whereIsHe(reader.readInt(),reader.readInt(),reader.readInt()));
            } else {
                System.out.println("Немає такого метода");
            }
        } else if (meth.contains("Six")) {
            Six six;
            if (avtor.contains("Nnn7")) {
              //  six = new com.ss.ita.kata.implementation.Nnn7.SixImpl();
                return;
            } else if (avtor.contains("andriikapustiak")) {
                six = new com.ss.ita.kata.implementation.andriikapustiak.SixImpl();
            } else if (avtor.contains("khrystiash")) {
                six = new com.ss.ita.kata.implementation.khrystiash.SixImplementation();
            } else if (avtor.contains("kuderiavetsnata")) {
                six = new com.ss.ita.kata.implementation.kuderiavetsnata.SixImpl();
            } else if (avtor.contains("nataliia0223")) {
                six = new com.ss.ita.kata.implementation.nataliia0223.SixImpl();
            } else if (avtor.contains("romankhvalbota")) {
                six = new com.ss.ita.kata.implementation.romankhvalbota.SixImpl();
            } else if (avtor.contains("vladislavshevchuk")) {
                six = new com.ss.ita.kata.implementation.vladislavshevhcuk.SixImp();
            } else {
                System.out.println("Немає такого автора чи кати");
                return;
            }

            if (meth.contains("findNb")) {
                System.out.println(six.findNb(reader.readLong()));
            }else if (meth.contains("balance")){
                System.out.println(six.balance(reader.readString()));
            } else if (meth.contains("f")) {
                System.out.println(six.f(reader.readDouble()));
            } else if (meth.contains("mean")) {
                System.out.println(six.mean(reader.readString(), reader.readString()));
                System.out.println(six.variance(reader.readString(), reader.readString()));
            } else if (meth.contains("nbaCup")) {
                System.out.println(six.nbaCup(reader.readString(), reader.readString()));
            } else if (meth.contains("stockSummary")) {
                System.out.println(six.stockSummary(reader.readArrayString(),reader.readArrayString()));
            } else {
                System.out.println("Немає такого метода");
            }
        }
        if (meth.contains("Five")) {
            Five five;
            if (avtor.contains("Nnn7")) {
             //   five = new com.ss.ita.kata.implementation.Nnn7.FiveImpl();
                return;
            } else if (avtor.contains("andriikapustiak")) {
                five = new com.ss.ita.kata.implementation.andriikapustiak.FiveImpl();
            } else if (avtor.contains("khrystiash")) {
                five = new com.ss.ita.kata.implementation.khrystiash.FiveImplementation();
            } else if (avtor.contains("kuderiavetsnata")) {
               // five = new com.ss.ita.kata.implementation.kuderiavetsnata.FiveImpl();
                return;
            } else if (avtor.contains("nataliia0223")) {
                five = new com.ss.ita.kata.implementation.nataliia0223.FiveImpl();
            } else if (avtor.contains("romankhvalbota")) {
                five = new com.ss.ita.kata.implementation.nataliia0223.FiveImpl();
            } else if (avtor.contains("vladislavshevchuk")) {
                five = new com.ss.ita.kata.implementation.vladislavshevhcuk.FiveImp();
            } else {
                System.out.println("Немає такого автора чи кати");
                return;
            }

            if (meth.contains("artificialRain")) {
                System.out.println(five.artificialRain(reader.readArrayInt()));
            } else if (meth.contains("gap")) {
                System.out.println(Arrays.toString(five.gap(reader.readInt(), reader.readLong(), reader.readLong())));
            } else if (meth.contains("zeros")) {
                System.out.println(five.zeros(reader.readInt()));
            } else if (meth.contains("perimeter")) {
                System.out.println(five.perimeter(reader.readBigInteger()));
            } else if (meth.contains("solveSum")) {
                System.out.println(five.solveSum(reader.readDouble()));
            } else if (meth.contains("smallest")) {
                System.out.println(Arrays.toString(five.smallest(reader.readLong())));
            } else {
                System.out.println("Немає такого метода");
            }
        }
    }
}