package ru.mirea.pr19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]){
        Generator generator = new Generator();
        generator.generate();
        ArrayList<String> listNumbers = generator.getList();
        Collections.sort(listNumbers);
        HashSet<String> hashSet = new HashSet<String>(listNumbers);
        TreeSet<String> treeSet = new TreeSet<String>(listNumbers);


        long start = System.nanoTime();
        boolean bDirectSearch1 = listNumbers.contains("К555УС113");
        long end = System.nanoTime();
        System.out.printf("Поиск перебором: номер %s, поиск занял %sнс\n", bDirectSearch1? "найден":"не найден", end-start);
        start = System.nanoTime();
        boolean bDirectSearch2 = listNumbers.contains("К555УС200");
        end = System.nanoTime();
        System.out.printf("Поиск перебором: номер %s, поиск занял %sнс\n", bDirectSearch2? "найден":"не найден", end-start);

        start = System.nanoTime();
        boolean bBinarySearch1 = Collections.binarySearch(listNumbers, "К555УС113")>0;
        end = System.nanoTime();
        System.out.printf("Бинарный поиск: номер %s, поиск занял %sнс\n",  bBinarySearch1? "найден":"не найден", end-start);
        start = System.nanoTime();
        boolean bBinarySearch2 = Collections.binarySearch(listNumbers, "К555УС113")>0;
        end = System.nanoTime();
        System.out.printf("Бинарный поиск: номер %s, поиск занял %sнс\n", bBinarySearch2? "найден":"не найден", end-start);

        start = System.nanoTime();
        boolean bHashSet1 = hashSet.contains("К555УС113");
        end = System.nanoTime();
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %sнс\n", bHashSet1? "найден":"не найден", end-start);
        start = System.nanoTime();
        boolean bHashSet2 = hashSet.contains("К555УС113");
        end = System.nanoTime();
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %sнс\n", bHashSet2? "найден":"не найден", end-start);

        start = System.nanoTime();
        boolean bTreeSet1 = treeSet.contains("К555УС113");
        end = System.nanoTime();
        System.out.printf("Поиск в TreeSet: номер %s, поиск занял %sнс\n", bTreeSet1? "найден":"не найден", end-start);
        start = System.nanoTime();
        boolean bTreeSet2 = treeSet.contains("К555УС113");
        end = System.nanoTime();
        System.out.printf("Поиск в TreeSet: номер %s, поиск занял %sнс\n", bTreeSet2? "найден":"не найден", end-start);
    }
}
