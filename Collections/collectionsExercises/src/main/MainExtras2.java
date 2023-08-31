package main;

import main.Entities.FamousSinger;

import java.util.ArrayList;
import java.util.Iterator;

public class MainExtras2 {
    public static void main(String[] args) {
        ArrayList<FamousSinger> famousSingerList = new ArrayList<>();
        String [] names = {"rocket", "mojito", "juancho", "paula", "manu"};
        Integer [] bestSellingDics = {23, 42, 31, 10, 40};
        for (int i = 0; i < 5; i++) {
            famousSingerList.add(new FamousSinger(names[i], bestSellingDics[i]));
        }

        for (FamousSinger fs :
                famousSingerList) {
            System.out.println(fs);
        }

        Iterator<FamousSinger> iterator = famousSingerList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase("mojito")) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println();

        for (FamousSinger fs :
                famousSingerList) {
            System.out.println(fs);
        }

    }
}
