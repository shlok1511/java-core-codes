import java.util.*;
class p76
{
 public static void main(String args[])
  {
   float loan,rate,dua,total_int,total_pay,emi;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter loan Amount= ");
    loan=sc.nextFloat();
    System.out.print("Enter Interest Rate=");
    rate=sc.nextFloat();
    System.out.print("Enter Duration= ");
    dua=sc.nextFloat();
    total_int=(loan*rate/100)*dua;
    System.out.println("Total Interest= "+total_int);
    total_pay=loan+total_int;
    System.out.println("Total PayMent= "+total_pay);
    emi=total_pay/(dua*12);
    System.out.println("EMI = "+emi);

     
  }
}