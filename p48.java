import java.io.DataInputStream;
class p48
{
 public static void main(String args[])
  {
   int n,sq;
   String s1;
   DataInputStream d1;
   d1=new DataInputStream(System.in);
   try 
    {
	System.out.print("Enter Any NO=");
        s1=d1.readLine();
	n=Integer.parseInt(s1);
        sq=n*n;
        System.out.println("Square="+sq);   

    }
    catch(Exception e)
     {
       System.out.println("Enter no only");
     }
  }
}