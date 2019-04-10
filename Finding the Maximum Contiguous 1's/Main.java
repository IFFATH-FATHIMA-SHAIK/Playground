import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int i,sum=0;
    int[] a=new int[n];
    for(i=0;i<n;i++) 
      a[i]=sc.nextInt();
    for(i=0;i<n-1;i++)
    { 
      if(a[i]==1)
        sum++;
      if(a[i+1]!=1) break;
    }
      System.out.print(sum);
    }
}