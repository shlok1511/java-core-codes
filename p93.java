import java.util.*;
class p93
{
 public static void main(String args[])
  {
   int sell,pur;
   String c;
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter Selling price= ");
    sell=sc.nextInt();
    System.out.print("Enetr Purchase price= ");
   pur=sc.nextInt();
    c=(sell>pur)? "Profit":"Loss";

   System.out.println("Person makes="+c);
   
   }
}