import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j;
      int[] a=new int[n];
      int temp;
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      for(i=0;i<n-1;i++)
      {
        for(j=0;j<n-1;j++)
        if(a[j]==0)
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
        for(i=0;i<n;i++)
          System.out.print(a[i]+" ");
    }
}