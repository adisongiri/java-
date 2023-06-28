import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        if(age>16){
            System.out.println("you can drive");
        }
        else {
            System.out.println("sorry you're not eligible");
        }
    }
}