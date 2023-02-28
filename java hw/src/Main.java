import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random number = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = number.nextInt(10);

        int Count = 0, i = 4;
        int Guess = 0;
        while (i >= 0) {
            System.out.println("Enter your guess (1-10):");

            Guess = scanner.nextInt();
            Count++;

            if (Guess == randomNumber) {
                System.out.println("Congrats You Win!");
                System.out.println("It took you " + Count + " tries");
                break;
            } else if (randomNumber > Guess) {
                System.out.println(" The number is higher.... Guess again!![chance left: " + i + "]");
            } else {
                System.out.println("The number is lower..... Guess again!![chance left: " + i + "]");
            }
            i--;

        }
        if (Guess!= randomNumber) {
            System.out.println("Sorry Chance over.");
            System.out.println("the number you should have guessed is : " + randomNumber);
        }

    }
}