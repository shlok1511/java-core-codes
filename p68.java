import java.util.*;
class p68
{
 public static void main(String args[])
  {
   float km,m,f;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Distance in KiloMeter= ");
   km=sc.nextFloat();
   m=km*1000;
   System.out.println("Distance in Meter="+m);
   f=m*3.28084f;
   System.out.println("Distance in Foot="+f);

   }

}
