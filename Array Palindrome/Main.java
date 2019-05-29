import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      	arr[i]=s.nextInt();
      int start=0;
      int end=n-1;
      int check=1;
      while(start<end)
      {
        if(arr[start]!=arr[end])
        {
          check=0;
          break;
        }
        start++;
        end--;
      }
      if(check==1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}


