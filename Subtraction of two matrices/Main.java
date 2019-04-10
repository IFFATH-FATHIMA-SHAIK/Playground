import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int i,j,r=sc.nextInt();
    int c=sc.nextInt();
    int[][] mat1=new int[r][c];
    int[][] mat2=new int[r][c];
    int[][] diff=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) mat1[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) mat2[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) diff[i][j]=mat1[i][j]-mat2[i][j];
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) System.out.print(diff[i][j]+" ");
      System.out.println();
    }
  }
}