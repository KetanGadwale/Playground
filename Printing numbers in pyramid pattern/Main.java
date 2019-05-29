import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int start=n-1,num=1;
      for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=start;j++)
       {
          System.out.print(" ");
       }
        for(int k=1;k<=i;k++)
        {
          System.out.print(num+" ");
          num++;
        }
        start--;
        System.out.print("\n");
      }
	}
}