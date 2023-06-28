import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("math marks=");
        int math= scanner.nextInt();
        System.out.println("science marks=");
        int sci= scanner.nextInt();
        System.out.println("nepali marks=");
        int nep=scanner.nextInt();
        int total=math+sci+nep;
        float per=total/3;
        System.out.println("percentage is"+per);

    }
}


