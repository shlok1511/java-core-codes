import java.util.*;
class p112
{
 public static void main(String args[])
  {
    char ch;
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter character= ");
    ch=sc.next().charAt(0);
    if(ch>='a' && ch<='z')
     {
         ch=(char)(ch-32);
        System.out.println("Converted to Captial= "+ch);
     }
    else if(ch>='A' && ch<='Z' )
     {
	ch=(char)(ch+32);
        System.out.println("Converted to Small= "+ch);
     }
   else
      {
        System.out.println("enter object is not character");
       }
  }
}