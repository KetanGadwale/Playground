import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String str1=s.nextLine();
      String str2=s.nextLine();
      System.out.print(str.replace(str1,str2));
    }
}