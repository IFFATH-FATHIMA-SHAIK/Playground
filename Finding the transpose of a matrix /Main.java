import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int i,j;
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] mat1=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++) mat1[i][j]=sc.nextInt();
    }
    for(i=0;i<c;i++)
    {
      for(j=0;j<r;j++) System.out.print(mat1[i][j]+" ");
      System.out.println();
    }
  }
}