class p39
{
	public static void main(String args[])
	 {
		Float bs,day,ms,ws;
		bs=Float.parseFloat(args[0]);
		System.out.println("Basic salary"+bs);
		day=Float.parseFloat(args[1]);
		System.out.println("Attend days"+day);
		ws=Float.parseFloat(args[2]);
		System.out.println("Working Days="+ws);
		ms=(float)(bs/ws)*day;
		System.out.println("Month Salary is="+ms);
	 }

}