import java.util.*;
class p56
{
 public static void main(String args[])
  {
   float radius,area,peri;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number=");
    radius=sc.nextFloat();
    System.out.println("Number is= "+radius);
    area=3.14f*radius*radius;
    System.out.println("Area is="+area);
    peri=2*3.14f*radius;
    System.out.println("Perimeter is="+peri);
  
  }
}
