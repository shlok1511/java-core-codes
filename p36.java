class p36
{
  public static void main(String args[])
	{
	 int n,sq;
	 if(args.length!=1)
	  {
		System.out.println("Please pass one number ");
		System.exit(0);
	
	  }
	try
	 {
	    n=Integer.parseInt(args[0]);
	    sq=n*n;
	    System.out.println("Number ="+n);
	    System.out.println("Square="+sq);
	 }
	catch(Exception e)
	  {
	   System.out.println("Plase enter no.");
	  }
	}
}