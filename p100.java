import java.util.*;
class p100
{
 public static void main(String args[])
  {
   int eng,mar,hin,gk,sci,math,total,per;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 6 Subject marks= ");
     eng=sc.nextInt();
     mar=sc.nextInt();
     hin=sc.nextInt();
     gk=sc.nextInt();
     sci=sc.nextInt();
     math=sc.nextInt();
     total=eng+mar+hin+gk+sci+math;
     System.out.println("Total  Marks= "+total);
     per=total/6;
     System.out.println("Percentage= "+per);
     if(eng>=35 && mar>=35 && hin>=35 && 35<=gk && 35<=sci &&math<=35)
       {
         System.out.println("Remark= Pass");
       }
     else
       {
            System.out.println("Remark= Fail");
       }
   }
}