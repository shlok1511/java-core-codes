import java.util.*;
class p104
{
 public static void main(String args[])
   {
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any three no.s=");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     if(a==b && b==c)
      {
	System.out.print("All nos are same........");
      }
     else if(a<b || a<c )
       {
         System.out.println("A is smallest No= "+a);
       }
     else if(b<a || b<c)
       {
         System.out.println("B is smallest No= "+b);
       }
     else 
         {
            System.out.println("C is smallest No="+c );
         }
  
    
   }
}