class p32
{
	public static void main(String args[]){
	
	int pop,tm,tw,lit,lm,lw,im,iw;
	pop=100000;
	tm=pop*52/100;
	tw=pop-tm;
	lit=pop*48/100;
	im=pop*35/100;
	iw=lit-im;
	lm=tm-im;
	lw=tm-iw;
	System.out.println("Total Population="+pop);
	System.out.println("Total men="+tm);
	System.out.println("Total women="+tw);
	System.out.println("Total litercacy="+lit);
	System.out.println("Total Literate Men="+im);
	System.out.println("Total Literate women="+lm);
	System.out.println("Total illLiterate Men="+lw);
	}
}