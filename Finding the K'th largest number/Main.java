import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      int[] a=new int[n];
      for(i=0;i<n;i++) {
        a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
          {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
        System.out.print(a[n-k]);
    }   
}