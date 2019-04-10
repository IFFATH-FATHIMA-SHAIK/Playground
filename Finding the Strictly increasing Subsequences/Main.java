import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int i;
    for(i=0;i<n;i++) a[i]=sc.nextInt();
    for(i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[j]>a[i] && a[j]>a[j-1]) {
          System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
}