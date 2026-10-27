import java.util.*;
class p94
{
 public static void main(String args[])
  {
    int eng,mar,math,sci,gk,hin,per,total;
    String rem;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 6 sub marks= ");
    eng=sc.nextInt();
    mar=sc.nextInt();
    math=sc.nextInt();
    sci=sc.nextInt();
    gk=sc.nextInt(); 
    hin=sc.nextInt();
    total=eng+mar+math+sci+gk+hin;
    per=(total)/6;
    rem=(eng<=35 && mar<=35 && math<=35 && sci<=35 && gk<=35 && hin<=35)?"Pass":"Fail";
    System.out.println("Total= "+total);
    System.out.println("Percentage= "+per);
    System.out.println("Remark="+rem);



    
  }
}