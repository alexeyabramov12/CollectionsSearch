package practice;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        String number = "A999AAA12";
        long time = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(list, number);
        time = System.nanoTime() - time;
        System.out.println("Поиск перебором занял: " + time + "нс");
        time = System.nanoTime();
        CoolNumbers.binarySearchInList(list, number);
        time = System.nanoTime() - time;
        System.out.println("Бинарный поиск занял: " + time + "нс");
        HashSet<String> hashSet = new HashSet<>(list);
        time = System.nanoTime();
        CoolNumbers.searchInHashSet(hashSet, number);
        time = System.nanoTime() - time;
        System.out.println("Поиск в HashSet занял: " + time + "нс");
        TreeSet<String> treeSet = new TreeSet<>(list);
        time = System.nanoTime();
        CoolNumbers.searchInTreeSet(treeSet, number);
        time = System.nanoTime() - time;
        System.out.println("Поиск в TreeSet занял: " + time + "нс");
    }
}
