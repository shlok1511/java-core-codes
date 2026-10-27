import java.util.*;
class p62
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int pr,qty,bill,dis ,tot;
   System.out.print("Enter the price= ");
   pr=sc.nextInt();
   System.out.println("Enter the Quantity= ");
   qty=sc.nextInt();
   bill=pr*qty;
   System.out.println("Bill="+bill);
   dis=(bill-10)/100;
   System.out.println("Discount= "+dis);
   tot=bill-dis;
   System.out.println("Total Bill After Applying Discount= "+tot);
    
  }
}