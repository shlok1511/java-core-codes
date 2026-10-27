class p41
{
  public static void main(String args[])
	{
		float eng,mara,hin,math,sci,gk,total,per;
		eng=Integer.parseInt(args[0]);
		mara=Integer.parseInt(args[1]);
		hin=Integer.parseInt(args[2]);
		math=Integer.parseInt(args[3]);
		gk=Integer.parseInt(args[4]);
		sci=Integer.parseInt(args[5]);
		System.out.println("English="+eng);
		System.out.println("Marathi="+mara);
		System.out.println("Hindi="+hin);
		System.out.println("Maths="+math);
		System.out.println("Science="+sci);
		System.out.println("GK="+gk);
		total=eng+mara+hin+math+gk+sci;
		System.out.println("Total="+total);
		per=(float)(total/6);
		System.out.println("Percentage ="+per);
	}
}