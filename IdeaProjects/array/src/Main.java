import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = {10, 20, 30};
//        for (int element : y) {
//            System.out.println(element);
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println("enter the  element" + i);
            x[i] = input.nextInt();
        }

            for(int i=0;i<3;i++) {
                System.out.println(x[i]);
            }




            }
    }
