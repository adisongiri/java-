import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);


        System.out.println("enter a age");
        int age = object.nextInt();

        System.out.println("enter a name");
        String name= object.next();
        System.out.println("my name is  "+name);
        System.out.println("and i am "+age+" years old");

    }
}