import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str1=s.nextLine();
    String str2=s.nextLine();
    int l1=str1.length();
    int l2=str2.length();
    int count=0;
    for(int i=0;i<(l1-l2+1);i++)
    {
      boolean m=true;
      for(int j=0;j<l2;j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          m=false;
          break;
        }
      }
      if(m==true)
        count++;
    }
    System.out.println(count);
  } 
}