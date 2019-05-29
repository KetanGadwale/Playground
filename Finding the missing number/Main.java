import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int stat[]=new int[n];
      for(int i=0;i<n;i++)
        stat[i]=0;
      for(int i=0;i<n;i++)
      {
        stat[arr[i]-1]++;
      }
      for(int i=0;i<n;i++)
      {
        if(stat[i]==0)
          System.out.print(i+1);
      }
    }
}