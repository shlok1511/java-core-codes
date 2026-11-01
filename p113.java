import java.util.*;
class p113
{
 public static void main(String args[])
  {
   char ch;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Any Character = ");
   ch=sc.next().charAt(0);
   if(ch>='A' && ch<='Z')
    {
      System.out.println("Element is Captial= "+ch);
    }
   else if(ch>='a' && ch<='z')
    {
     
      System.out.println("Element is Small= "+ch);
    }
  else if(ch>='0' && ch<='9')
   {
    System.out.println("Enter element is Number= "+ch); 
   }
  else
     {
       System.out.println("Enter element is Sysmbol="+ch);
     }
    
  }
}