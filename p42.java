class p42
{
 public static void main(String args[])
  {
  float bs,ta,da,hra,gs;
	bs=Float.parseFloat(args[0]);
        System.out.println("Basic Salary is="+bs);
        ta=bs*5/100;
	da=bs*10/100;
	hra=bs*15/100;
	gs=bs+ta+da+hra;
	System.out.println("TA="+ta);
	System.out.println("DA="+da);
	System.out.println("HRA="+hra);
	System.out.println("Gross Salray ="+gs);
  }

}