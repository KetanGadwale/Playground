import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      String str1=s.next();
      String str2=s.next();
      String temp=str1.concat(str1);
      if(temp.contains(str2)==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}