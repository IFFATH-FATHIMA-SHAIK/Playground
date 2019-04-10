import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int i,j;
    for(i=0;i<n;i++) a[i]=sc.nextInt();
    for(i=0;i<n/2;i++)
    {
      for(j=0;j<n/2-1;j++){
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(i=n/2;i<n-1;i++)
    {
      for(j=n/2;j<n-1;j++)
      {
        if(a[j]<a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(i=0;i<n;i++) System.out.print(a[i]+" ");
    }
  }