import java.util.*;
class p95
{
 public static void main(String args[])
 {
  Float pr,qty,dis,bill,c;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter price= ");
    pr=sc.nextFloat();
   System.out.println("Enter quantity= ");
     qty=sc.nextFloat();
   bill=pr*qty;
   System.out.println("Bill will be= "+bill);
   dis=(bill*50)/100;
   System.out.println("Total dicount "+dis);
     bill=bill-dis;
   System.out.println("Total bill After discount will be="+bill);
   
  }
}