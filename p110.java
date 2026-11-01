import java.util.*;
class p110
{
 public static void main(String []args)
  {
   char ch;q
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any Character=");
     ch=sc.next().charAt(0);
   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
     {
       System.out.println("Enter Charcter is Vowel= "+ch);
     }
   else
      {
       System.out.println("Enter Character is not vowel");
      }
  }
}
