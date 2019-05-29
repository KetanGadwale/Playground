import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      int n=s.nextInt();
      str1=str1.replace(str1,str2);
      for(int i=0;i<str1.length();i++)
      {
        if(str1.charAt(i)!=32)
          System.out.print(str1.charAt(i));
        else
          System.out.println();
      }
    }
}