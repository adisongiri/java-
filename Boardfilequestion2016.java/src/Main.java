import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename="purwanchal.dat";
                String data= "i study in 4 sem";
        try{
            DataOutputStream outputStream=new DataOutputStream(new FileOutputStream(filename));
            outputStream.writeUTF(data);
            outputStream.close();
            System.out.println("data has been written");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}