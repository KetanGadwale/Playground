import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        int c=1;
        int d=arr[i]>arr[j]?arr[i]:arr[j];
        if(arr[i]<arr[j])
        {
          for(int k=i+1;k<j;k++)
          {
            if(arr[k]>d)
              c=0;
          }
          if(c==1)
          System.out.println(arr[i]+","+arr[j]);
        }
      }
      
    }
  }
}