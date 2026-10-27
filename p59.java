import java.util.*;
class p59
{
 public static void main(String args[])
 {
 char ch;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter Small alphabet= ");
  ch=sc.next().charAt(0);
  ch=(char)(ch-32);
 System.out.println("Small to Captail Conversion is= "+ch);
 }
}