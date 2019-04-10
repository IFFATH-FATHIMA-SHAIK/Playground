import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,res=0,count=0,max_count=0;
    int[] a=new int[n];
    for(i=0;i<n;i++) 
      a[i]=sc.nextInt();
    Arrays.sort(a);
    for (i = 1; i < n; i++) 
        { 
            if (a[i] == a[i - 1]) 
                count++; 
            else 
            { 
                if (count > max_count) 
                { 
                    max_count = count; 
                    res = a[i - 1]; 
                } 
                count = 1; 
            } 
        } 
    if (count > max_count) 
        { 
            max_count = count; 
            res = a[n - 1]; 
        } 
      System.out.print(res);
  }
}