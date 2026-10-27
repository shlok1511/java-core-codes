import java.util.*;
class p71
{
 public static void main(String args[])
  {
  float gb,mb,kb;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no= ");
  gb=sc.nextFloat();
  mb=(float)gb*1024;
  System.out.println("MB= "+mb);
  kb=(float)mb*1024;
  System.out.println("KB= "+kb);
  }
}