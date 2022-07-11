package practice;

import java.util.*;

public class CoolNumbers {

    public static String number = "A999AA11";

    public static List<String> generateCoolNumbers() {
        List<String> listCoolNumbers = new ArrayList<>();
        List<String> listLetters = generateListLetters();
        List<String> listNumbers = generateListNumbers();
        List<String> listRegions = generateListRegions();
        for (int i = 0; i < listRegions.size(); i++) {
            String region = listRegions.get(i);
            for (int j = 0; j < listLetters.size(); j++) {
                String letter3 = listLetters.get(j);
                for (int k = 0; k < listLetters.size(); k++) {
                    String letter2 = listLetters.get(k);
                    for (int l = 0; l < listNumbers.size(); l++) {
                        String number = listNumbers.get(l);
                        for (int m = 0; m < listLetters.size(); m++) {
                            String letter1 = listLetters.get(m);
                            listCoolNumbers.add(letter1 + number + letter2 + letter3 + region);
                        }
                    }
                }
            }
        }

        return listCoolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        boolean contains = false;
        if (list.contains(number)) {
            contains = true;
        }
        return contains;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        boolean contains = false;
        if (Collections.binarySearch(sortedList, number) != -1) {
            contains = true;
        }
        return contains;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean contains = false;
        if (hashSet.contains(number)) {
            contains = true;
        }
        return contains;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean contains = false;
        if (treeSet.contains(number)) {
            contains = true;
        }
        return contains;
    }

    private static List<String> generateListLetters() {
        List<String> listLetters = new ArrayList<>();
        listLetters.add("А");
        listLetters.add("В");
        listLetters.add("Е");
        listLetters.add("К");
        listLetters.add("М");
        listLetters.add("Н");
        listLetters.add("О");
        listLetters.add("Р");
        listLetters.add("С");
        listLetters.add("Т");
        listLetters.add("У");
        listLetters.add("Х");
        return listLetters;
    }

    private static List<String> generateListNumbers() {
        List<String> listNumbers = new ArrayList<>();
        listNumbers.add("111");
        listNumbers.add("222");
        listNumbers.add("333");
        listNumbers.add("444");
        listNumbers.add("555");
        listNumbers.add("666");
        listNumbers.add("777");
        listNumbers.add("888");
        listNumbers.add("999");
        return listNumbers;
    }

    private static List<String> generateListRegions() {
        List<String> listRegions = new ArrayList<>();
        for (int i = 1; i <= 199; i++) {
            if (i < 10) {
                listRegions.add("0" + i);
            }else {
                String numbers = Integer.toString(i);
                listRegions.add(numbers);
            }
        }
        return listRegions;
    }
}
