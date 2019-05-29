import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int b=s.nextInt();
      int e=s.nextInt();
      int r=1;
      while(e!=0)
      {
        r=r*b;
        e--;
      }
      System.out.print(r);
    }
}