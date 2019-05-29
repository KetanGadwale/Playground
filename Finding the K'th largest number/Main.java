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
      int k=s.nextInt(),temp;
     for(int j=0;j<n-1;j++)
     {
       for(int i=0;i<n-1-j;i++)
       if(arr[i]<arr[i+1])
       {
         temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;
       }
     }
      System.out.print(arr[k-1]);
    }   
}