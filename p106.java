import java.util.*;
class p106
{
  public static void main(String args[])
   {
     int sel,pur;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter selling Price= ");
      sel=sc.nextInt();
    System.out.print("Enter purschase price= ");
     pur=sc.nextInt();
    if(sel==pur)
	{
         System.out.println("Enter purchase price and selling price is same so no profit no loss.....");
        }
    else if(sel>pur)
        {
          System.out.println("person makes profit= "+sel);
        }
     else
	{
           System.out.println("person make loss"); 
        }
   }
}
