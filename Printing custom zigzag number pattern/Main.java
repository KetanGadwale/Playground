import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          for(int j=1;j<=n-1;j++)
            System.out.print(i);
          System.out.print(i+1);
         }
        else
        {
          System.out.print(i+1);
          for(int j=2;j<=n;j++)
            System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}



