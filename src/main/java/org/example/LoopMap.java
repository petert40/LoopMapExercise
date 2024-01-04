package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, String> vehicles = new HashMap<>();
        vehicles.put("Civic", "Honda");
        vehicles.put("X1","BMW");
        vehicles.put("Accord","Honda");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Customer, which model are you looking for");
        String model = scanner.nextLine();
        if(vehicles.containsKey(model)){
            System.out.printf("Oh, you're looking for a %s? Our %s selections is right over here..\n", model, vehicles.get(model));
        }else{
            System.out.println("Sorry, the model you inquired is not available at the moment");
        }
    }
}
