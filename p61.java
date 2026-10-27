import java.util.*;
class p61
{
 public static void main(String args[])
  {
  float bs,gs,ta,da,hra;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Basic Salary= ");
  bs=sc.nextInt();
  ta=bs*5/100;
  da=bs*10/100;
  hra=bs*15/100;
  gs=bs+ta+da+hra;
 System.out.println("TA= "+ta);
 System.out.println("DA= "+da);
 System.out.println("HRA="+hra);
 System.out.println("GS="+gs);
  }
}