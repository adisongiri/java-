import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args)throws MalformedURLException, NotBoundException, RemoteException {
        HelloService obj=(HelloService)Naming.lookup("rmi://localhost:59099/Adison");
        System.out.println(obj.printMessage());
    }
}
