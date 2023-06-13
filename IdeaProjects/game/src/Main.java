import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner inputobject= new Scanner(System.in);
            System.out.println("enter r,s,p as your wish");
            char userMove=inputobject.next().charAt(0);
            System.out.println("user input"+userMove);
            char[] arr={'r','s','p'};
            Random random= new Random();
            int guessNumber= random.nextInt(3);
            char computerMove=arr[guessNumber];
            System.out.println("computer move"+computerMove);

            computerMove = user -> tie !';'
            user "S";
            computer "R" -: c wins!;
             user wins;
            user "P";
             computer "R" -: U wins!;
             c wins;

            user "R";
            computer "S" -: U wins!;
            computer wins;
        }


    }
    }
