import java.util.Scanner;
class MYthread extends Thread{
 public   void run(){
     int i=0;
        while (i<=2)
        {
            System.out.println("try");
            System.out.println("niwii");
            i++;

        }
    }
}
class MYthread1 extends Thread{
    public void run(){
       int i=0;
        while (i<=2)
        {
            System.out.println("try2222");
            System.out.println("niwi122122222222222i");
             i++;
        }
    }
}
public class Main{
    public static void main(String[] args) {
MYthread t1=new MYthread();
MYthread1 t2=new MYthread1();
t1.start();
t2.start();
    }
}



