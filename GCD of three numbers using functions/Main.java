import java.util.Scanner;
class Main
{
  public static int gcd(int a,int b)
  {
    int i;
    for(i=(a<b?a:b);i>=1;i--)
    {
      if((a%i==0) && (b%i==0))
      {
        break;
      }
    }
    return i;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int r=gcd(n1,n2);
      r=gcd(r,n3);
      System.out.println(r);
	}
}