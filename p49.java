
import java.io.*;
class p49
{
 public static void main(String args[])
  {
    int n,sq;
   DataInputStream x=new DataInputStream(System.in);
   try
   {
    System.out.println("Enter a No=");
    n=Integer.parseInt(x.readLine());
    sq=n*n;
    System.out.println("Square is= "+sq);
  
   }
   catch(Exception e)
    {
    System.out.println("Please Enter no Only......");
    } 
    
  }
}