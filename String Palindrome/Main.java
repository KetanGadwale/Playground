import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int l=str.length();
      int check=1;
      for(int front=0,end=l-1;front<end;front++,end--)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          check=0;
          break;
        }
      }
      if(check==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}
