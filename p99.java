import java.util.*;
class p99
{
  public static void main(String args[])
   {
    int a,b,c,sum;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 3 angles= ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    sum=a+b+c;
    if(sum==100 && a>0 && b>0 && c>0)
     {
      System.out.println("Traingle is Valid");

      }
     else
      {
        System.out.println("Not Valid Traingle ");
      }
    }
}