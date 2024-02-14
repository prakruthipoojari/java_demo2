class methodpoly
{
 public static void main(String args[])
 { 
	int a=10,b=20;
  System.out.println("result of addition is(integer)="+add(10,20));
  
  int r2=add(100,200,300);
  System.out.println("result of addition of three integer="+r2);
  System.out.println("result of addition of two double values"+add(25.5,50.5));
  
}
  public static int add(int a,int b)
  {
    return(a+b);
  }
  public static int add(int a,int b, int c)
  {
    return(a+b+c);
  }
  public static double add(double a, double b)
  {
    return(a+b);
  }

}
