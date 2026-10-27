import java.util.*;
class p90
{
 public static void main(String args[])
 {
   String yrs;
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any year= ");
   n=sc.nextInt();
   yrs=(n%4==0)? "Leap year":"Not Leap Year";
  System.out.println("Inserted year is= "+yrs);
  } 
}