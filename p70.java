import java.util.*;
class p70
{
 public static void main(String args[])
  {
   float yrs,day,w,m;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no of years= " );
   yrs=sc.nextFloat();
   day=365*yrs;
   System.out.println("No of Days in Year="+day);
   w=day/7;
   System.out.println("No of weeks in Year="+w);
   m=yrs*12;
   System.out.println("No of years ="+m);

  }
}