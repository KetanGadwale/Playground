import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.print(sum(n));
    }
  public static int sum(int n)
  {
    if(n>0)
      return n+sum(n-1);
    return 0;
  }
}