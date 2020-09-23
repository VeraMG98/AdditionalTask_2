package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Mouse", "Rodent", "Animal"));
        ArrayList<String> arrayListSecond = new ArrayList<>(Arrays.asList("Music", "Pop", "Hip-Hop"));
        ArrayList<String> arrayListThird = new ArrayList<>(Arrays.asList("Toy", "Dol", "Car"));
        ArrayList[] arrayLists = {arrayList, arrayListSecond, arrayListThird};
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (ArrayList item : arrayLists) {
            if (item.contains(word))
                chanceTwo(item, word);
        }
    }

    public static void chanceTwo(ArrayList<String> arrayList, String word) {
        Map<String, ArrayList<String>> value = new HashMap<>();
        if (arrayList.contains(word)) {
            arrayList.remove(word);
            value.put(word, arrayList);
        } else {
            chanceTwo(arrayList, word);
        }
        Random random = new Random();
        int index = random.nextInt(value.size() + 1);
        System.out.println(value.get(word).get(index));
        System.out.println(value);
    }
}
