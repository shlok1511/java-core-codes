class p43
{
 public static void main(String args[])
   {

   float it,qty,bill;
	System.out.println("Enter iteam and quantity price="+it);
	
	it=Float.parseFloat(args[0]);
	System.out.println("Enter  quantity price="+qty);
	qty=Float.parseFloat(args[1]);
	bill=it*qty;
	System.out.println("Bill = "+bill);
	
   }
}