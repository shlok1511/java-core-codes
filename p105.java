import java.util.*;
class p105
{
  public static void main(String args[])
   {
     int no1,no2;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Two nos= ");
     no1=sc.nextInt();
     no2=sc.nextInt();
     if(no1==no2)
     {
        System.out.println("Enter No is Same please change you no....... ");

     }
    else if(no1>=no2)
      {
       System.out.println("No1 is Max= "+no1);
      }
    else
       {
         System.out.println("No2 is Max= "+no2);

       }
   }
}