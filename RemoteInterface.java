 import java.rmi.*;

public interface RemoteInterface extends Remote
{
 public String reverse(String str)throws RemoteException;
public void compare(String str,String str2)throws RemoteException;
public void append(String str,String str2)throws RemoteException;
 public void ucase(String str)throws RemoteException;

 public void lcase(String str)throws RemoteException;
}
