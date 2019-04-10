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
    int[][] b=new int[r][c];
    boolean flag=true;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) a[i][j]=sc.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) b[i][j]=sc.nextInt();
    }
      for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) {
        if(a[i][j]==b[i][j]) flag=true;
        else{
          flag=false;
          break;
        }
    }
  }
  if(flag) System.out.print("Yes");
    else System.out.print("No");
}
}