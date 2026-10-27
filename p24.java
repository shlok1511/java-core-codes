class p24
{
public static void main(String []args){
float loan,rate,year,total_interest,total_pay,emi;
loan=50000;
rate=10;
year=2;
total_interest=(loan*rate/100)*year;
total_pay=loan+total_interest;
emi=total_pay/(year*2);
System.out.println("Toatl loan= "+loan);
System.out.println("Interest Rate = "+rate+"%");
System.out.println("Duration = "+year+" years");
System.out.println("Total Interset = "+total_interest);
System.out.println("Total pay amount ="+total_pay);
System.out.println("EMI ="+emi);
}}