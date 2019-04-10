import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      int i,j;
      for(i=0;i<n;i++)
        a[i]=s.nextInt();
      int val=s.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]+a[j]==val)
            System.out.println(a[i]+", "+a[j]);
        }
      }
    }
}