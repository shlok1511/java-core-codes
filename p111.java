import java.util.*;
class p111
{
 public static void main(String args[])
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any character= ");
      ch=sc.next().charAt(0);
      if(ch>='a' && ch>='z')
          {
            System.out.print("Enter character is small ="+ch);
          }
      else if (ch>='A' && ch>='Z')
           {
             System.out.println("Enter Character is Captial= "+ch);
           }
  }
}