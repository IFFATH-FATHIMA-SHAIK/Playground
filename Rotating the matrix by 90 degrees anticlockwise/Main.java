import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int i,j;
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] a=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) a[i][j]=sc.nextInt();
    }
      for(j=c-1;j>=0;j--)     {
        for(i=0;i<r;i++)
        System.out.print(a[i][j]+" ");
      System.out.println();
    }
    /*for(i=0;i<r;i++) {
      for(j=0;j<c;j++)
        if(i==j-1) System.out.print(a[i][j]+" ");
    }
    for(i=0;i<r;i++) {
      for(j=0;j<c;j++)
        if(i==j-2) System.out.print(a[i][j]+" ");
    }*/
  }
}