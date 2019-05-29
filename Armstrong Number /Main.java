import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int temp=n,c=0,r,d,sum=0;
      while(n!=0)
      {
        c++;
        n=n/10;
      }
      n=temp;
      for(int i=0;i<=c;i++)
      {
        d=n%10;
        r=1;
        for(int j=1;j<=c;j++)
        {
          r=r*d;
        }
        sum=sum+r;
        n=n/10;
      }
      if(sum==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}




