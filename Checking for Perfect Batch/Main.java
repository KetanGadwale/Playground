import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    int sum[]=new int[n/3],j=0,per=0;
    for(int i=0;i<n/3;i++)
    {
      for(int k=1;k<=3;k++)
      {
      sum[i]=sum[i]+arr[j];
      j++;
      }
    }
    for(int i=0;i<(n/3)-1;i++)
    {
      if(sum[i]==sum[i+1])
        per=1;
      else
        per=0;
    }
    if(per==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}