import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,count=0;
      int[] a=new int[n];
      int[] b=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      b[0]=1;
      for(i=1;i<n;i++) b[i]=b[i-1]+1;
      for(i=0;i<n;i++)
      {
        count=0;
        for(j=0;j<n;j++)
        {
          if(b[i]!=a[j]) 
          {
            count++;
          }
        }
        if(count==n) System.out.print(b[i]); 
      }
    }
}