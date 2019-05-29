import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=new String();
      str=s.nextLine();
      int stat[]=new int[26];
      int l=str.length();
      for(int i=0;i<26;i++)
        stat[i]=0;
      for(int i=0;i<l;i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
          stat[str.charAt(i)-'a']++;
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          stat[str.charAt(i)-'A']++;
      }
     for(int i=0;i<26;i++)
     {
       if(stat[i]==0)
         System.out.print((char)('a'+i)+" ");
     }
    }
}

