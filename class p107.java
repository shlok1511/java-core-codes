import java.util.*;
class p107
{
 public static void main(String args[])
  {
   int age;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the age =");
   age=sc.nextInt();
   if(age>=18)
    {
      System.out.println("Enter person age is eligible for voiting = "+age);
    }
    else
	{
	  System.out.println("Enter person age is not eligible for voting = "+age);
        }
  }
}