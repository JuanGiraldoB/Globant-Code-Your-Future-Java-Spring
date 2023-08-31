package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainExtras4 {
    public static void main(String[] args) {

        HashMap<String, Integer> postalCodes = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String city;
        int code;

        for (int i = 0; i < 2; i++) {
            city = scan.next();
            scan.nextLine();
            code = scan.nextInt();
            postalCodes.put(city, code);
        }

        for (Map.Entry<String, Integer> coutry:
                postalCodes.entrySet()) {
            System.out.println(coutry.getKey() + " - " + coutry.getValue());
        }



        int codeToFind = 2;
        String cityWithCode = getKeyByValue(postalCodes, codeToFind);
        if (cityWithCode != null) {
            System.out.println("City with postal code " + codeToFind + " is: " + cityWithCode);
        } else {
            System.out.println("Postal code " + codeToFind + " not found in the map.");
        }

    }

    public static <K, V> K getKeyByValue(HashMap<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }


}
