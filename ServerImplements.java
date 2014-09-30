 import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;



public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
  {

 	 public ServerImplements()throws Exception
 		 {
 		 super();
  		}

	public String reverse(String str)throws RemoteException
   		{

     		int i,length;
    		 String rev=" ";
     		length=str.length();
     		for(i=length-1;i>=0;i--)
     			{
       			rev+=str.charAt(i);
    			 }
		System.out.println("reverse is"+rev);
		return(rev);
		}

	public void compare(String str,String str2)throws RemoteException
   {
      if(str.compareTo(str2)>0)
      {
        System.out.println("First string is greater");
      }
      else if(str.compareTo(str2)<0)
      {
         System.out.println("Second string is greater");
      }
      else
      { 
        System.out.println("Both are equal");
      }
   }



public void append(String str,String str2)throws RemoteException
   
   {
     String c;
     c=str.concat(str2);
     System.out.println("The String after concatenation is :"+c);
   }



 public void ucase(String str)throws RemoteException
   
   {
     String lstr;
     lstr=str.toLowerCase();
 System.out.println("lower:"+lstr);
   }


  public void lcase(String str)throws RemoteException
   
   {
     String ustr;
     ustr=str.toUpperCase();
System.out.println("upperr:"+ustr);
   }

}
