import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServet extends UnicastRemoteObject implements HelloService{

    protected HelloServet() throws RemoteException {
        super();
    }

    public String printMessage()  throws RemoteException{
        return "hey this is a message";
    }
}
