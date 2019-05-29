import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=s.nextInt();
    int mid=n/2,temp;
    //first half
    for(int i=0;i<mid-1;i++)
    {
      for(int j=0;j<mid-1-i;j++)
      if(arr[j]>arr[j+1])
      {
       temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
    //second half
    for(int i=mid;i<n-1;i++)
    {
      for(int j=mid;j<n-1;j++)
      {
        if(arr[i]<arr[j+1])
        {
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}


