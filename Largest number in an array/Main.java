import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      int max=arr[0];
      for(int i=1;i<n;i++)
      {
        if(arr[i]>max)
          max=arr[i];
      }
      System.out.println(max);
    }
}