package practice;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        String number = "A999AAA12";
        long time = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(list, number);
        time = System.nanoTime() - time;
        System.out.println("Direct enumeration over ArrayList: " + time + " nanoseconds");
        time = System.nanoTime();
        CoolNumbers.binarySearchInList(list, number);
        time = System.nanoTime() - time;
        System.out.println("Binary search on a sorted ArrayList: " + time + " nanoseconds");
        HashSet<String> hashSet = new HashSet<>(list);
        time = System.nanoTime();
        CoolNumbers.searchInHashSet(hashSet, number);
        time = System.nanoTime() - time;
        System.out.println("Search in HashSet: " + time + " nanoseconds");
        TreeSet<String> treeSet = new TreeSet<>(list);
        time = System.nanoTime();
        CoolNumbers.searchInTreeSet(treeSet, number);
        time = System.nanoTime() - time;
        System.out.println("Search in TreeSet : " + time + " nanoseconds");
    }
}
