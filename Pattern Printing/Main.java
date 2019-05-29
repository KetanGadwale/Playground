import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      int n=r;
      for(int i=n;i>=1;i--)
      {
        int temp=n;
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(temp);
          temp--;
        }
        for(int j=1;j<=i;j++)
          System.out.print(i);
        System.out.println();
      }
    }
}