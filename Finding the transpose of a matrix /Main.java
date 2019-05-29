import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // Type your code here
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int matrix[][]=new int[r][c];
    //int transpose[][]=new int[c][r];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        matrix[i][j]=s.nextInt();
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        System.out.print(matrix[j][i]+" ");
      System.out.print("\n");
    }
  }
}