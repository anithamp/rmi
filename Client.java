 import java.rmi.*;
import java.io.*;


public class Client
{
public static void main(String args[])
  {
 try
  {
 String ip="//192.168.0.19/localhost/SERVICE";
 RemoteInterface s=
   (RemoteInterface)Naming.lookup(ip);


System.out.println("enter the String");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
s.reverse(str);
System.out.println("enter the second String");
String str2=br.readLine();
s.compare(str,str2);
s.append(str,str2);
s.lcase(str);
s.ucase(str2);



  }
 catch(Exception e)
  {
  System.out.println(e.getMessage());
  e.printStackTrace();
  }
  }
}
