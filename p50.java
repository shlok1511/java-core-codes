import java.io.*;
class p50
{
 public static void main(String args[])
  {
   String a;
   DataInputStream x=new DataInputStream(System.in);
   try 
    {
    System.out.print("Enter any String=");
    a=x.readLine();
    System.out.println("String ="+a);
    }
   catch(Exception e)
   {
   System.out.println("Error");
   }
  }

}