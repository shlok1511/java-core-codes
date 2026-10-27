import java.util.*;
class p63
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  float p,men,wom;
  System.out.print("Enter the population= ");
  p=sc.nextFloat();
  men=52*p/100;
  System.out.println("Total Population of men= "+men);
 wom=p-men;
 System.out.println("Total Population of women= "+wom);
}
}
