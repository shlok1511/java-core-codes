class p40
{
	public static void main(String args[])
	 {
	 float len,wid,area,peri;
	 len=Float.parseFloat(args[0]);
	 System.out.println("Enter Length ="+len);
	 wid=Float.parseFloat(args[1]);
	 System.out.println("Enter width ="+wid);
	 area=len+wid;
	 System.out.println("Area is="+area);
 	 peri=2*(len+wid);
	 System.out.println("Perimeter is="+peri);	
         }

}