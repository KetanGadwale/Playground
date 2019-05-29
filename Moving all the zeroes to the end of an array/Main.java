import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      int zero[]=new int[n];
      int num[]=new int[n];
      int z=0,p=0;
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
        {
          zero[z]=0;
          z++;
        }
        else
        {
          num[p]=arr[i];
          p++;
        } 
      }
      int index=0;
      for(int i=0;i<p;i++)
      {
        arr[index]=num[i];
        index++;
      }
      for(int i=0;i<z;i++)
      {
        arr[index]=zero[i];
        index++;
      }
      for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}


