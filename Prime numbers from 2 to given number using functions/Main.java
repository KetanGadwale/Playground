import java.util.Scanner;
class Main
{
  public static void prime_n(int n)
  {
    for(int i=2;i<=n;i++)
    {
      int c=0;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          c++;
          break;
        }
      }
      if(c==0)
        System.out.println(i);
    }
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      prime_n(n);
	}
}