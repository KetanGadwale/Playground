import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int key=s.nextInt();
    int n=str.length();
    int temp,sub;
    for(int i=0;i<n;i++)
    {
      temp=str.charAt(i)-key;
      if(str.charAt(i)>='a'&& str.charAt(i)<='z')
      {
        if(temp>='a' && temp<='z')
          System.out.print((char)temp);
        else
        {
          sub=('a'-temp)%26;
          temp='z'-sub+1;
          System.out.print((char)temp);
        }
      }
      else if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
      {
        if(temp>='A' && temp<='Z')
          System.out.print((char)temp);
        else
        {
          sub=('A'-temp)%26;
          temp='Z'-sub+1;
          System.out.print((char)temp);
        }
      }
      else
        System.out.print(str.charAt(i));
    }
  }
}
