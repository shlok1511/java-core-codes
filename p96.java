class p96
{
 public static void main(String args[])
  {
    byte a,b,c,d,e,f,g,h;
    a=75;
    b=90;
    c=(byte)(~a);
    d=(byte)(a<<3);
    e=(byte)(a>>3);
    f=(byte)(a&b);
    g=(byte)(a/b);
    h=(byte)(a^b);
    System.out.println("A= "+a);
    System.out.println("B= "+b);
    System.out.println("C= "+c);
    System.out.println("D= "+d);
    System.out.println("E= "+e);
    System.out.println("F= "+f);
    System.out.println("G= "+g);
    System.out.println("H= "+h);
  }

}