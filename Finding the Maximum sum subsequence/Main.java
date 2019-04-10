import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,sum=0;
    int[] a=new int[n];
    for(i=0;i<n;i++) 
      a[i]=sc.nextInt();
    for(i=0;i<n-1;i++)
    {
      if(a[i]<a[i+1])
         {
           sum=sum+a[i];
         }
         else sum=0;
    }
    sum=sum+a[n-1];
    System.out.print(sum);     
  }
}