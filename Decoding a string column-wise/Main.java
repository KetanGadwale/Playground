import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuilder text=new StringBuilder(str);
    int c=s.nextInt();
    deletespaces(text,text.length());
    int l=text.length();
    int r=l/c;
    int char_indx=0;
    if((l%c)>0)
      r++;
    for(int i=0;i<c;i++)
      for(int j=0;j<r;j++)
      {
        char_indx=i+j*c;
        if(j%2==1)
        {
          char_indx=((c-1)+j*c)-i;
        }
        char ch;
        if(char_indx>=l)
          ch='X';
        else
          ch=text.charAt(char_indx);
        System.out.print(ch);
      }
  }
  public static void deletespaces(StringBuilder str,int n)
  {
    StringBuilder temp=new StringBuilder();
    for(int i=0;i<n;i++)
      if(str.charAt(i)!=' ')
        temp.append(str.charAt(i));
    str.setLength(0);
    for(int i=0;i<temp.length();i++)
    {
      str.append(temp.charAt(i));
    }
  }
}




