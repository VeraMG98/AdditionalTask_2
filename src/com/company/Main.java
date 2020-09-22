package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map <String, String> value = new HashMap<>();
        value.put("Guitar", "Instrument");
        value.put("Mouse", "Animal");
        value.put("Bear", "Toy");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (Map.Entry<String, String> item : value.entrySet()) {
            if (word.equals(item.getKey()))
                System.out.println(item.getValue());
            else if (word.equals(item.getValue()))
                System.out.println(item.getKey());
        }
    }
}
