package Entities;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private Integer lowerRange;
    private Integer upperRange;
    private Integer correctNumber;
    private Integer attempts;
    private Boolean gameOver;

    public GuessGame() {
    }

    public GuessGame(Integer lowerRange, Integer upperRange) {
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        attempts = 0;
        gameOver = false;
        createCorrectNumber();
    }

    private void createCorrectNumber(){
        Random rand = new Random();
        this.correctNumber = rand.nextInt(lowerRange, upperRange) + 1;
    }

    private void checkGuess(int num){
        attempts++;
        if (num > correctNumber) {
            System.out.println("The number is smaller");
        } else if (num < correctNumber){
            System.out.println("The number is bigger");
        } else {
            System.out.println("Your guess is correct");
            System.out.println("It took: " + attempts + " attempts");
            gameOver = true;
        }
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);

        while(!gameOver) {
            try{
                System.out.print("Your guess: ");
                int num = scanner.nextInt();

                checkGuess(num);

            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }finally {
                scanner.nextLine();
            }
        }
    }

}
