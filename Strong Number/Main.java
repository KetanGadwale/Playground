import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n =s.nextInt(),f,temp,sum=0,d;
      temp=n;
      while(n!=0)
      {
      f=1;  
      d=n%10;
      for(int i=1;i<=d;i++)
        f=f*i;
      sum=sum+f;
      n=n/10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}