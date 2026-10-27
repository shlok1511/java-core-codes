class Student
{
  private int roll;
  private String name;
  public void setdata(int x,String y)
    {
      roll=x;
      name=y;

    }
    public void showdata()
     {
       System.out.println("Roll no="+roll);
	System.out.println("Name="+name);

     }
     class demo
	{
	  public static void main(String args[])
           {
           Student a=new Student();
	   a.setdata(101,"ABC");
	   System.out.println("Student info=");
           a.showdata();
           
            }
        }

}