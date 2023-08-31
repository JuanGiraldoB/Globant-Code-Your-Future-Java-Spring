package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExtra1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number = 0;
        do {

            try {
                System.out.print("Num: ");
                number = scan.nextInt();

                if (number != -99) {
                    numbers.add(number);
                }

            }catch (InputMismatchException error) {
                System.out.println(error);
                scan.nextLine();
            }


        }while (number != -99);

        int sum = sum(numbers);
        int size = numbers.size();
        float median = (float) sum / size;

        System.out.println("Number of elements: " + size);
        System.out.println("Sum is: " + sum);
        System.out.println("Median is: " + median);
    }
    
    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;

        for (int i :
                nums) {
            sum += i;
        }

        return sum;
    }


}
