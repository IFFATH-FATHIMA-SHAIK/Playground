import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int i,j,count=0;
      int[] a=new int[n];
      int[] b=new int[k];
      for(i=0;i<n;i++) {
        a[i]=sc.nextInt();
      }
      for(i=0;i<k;i++) b[i]=i+1;
      for(i=0;i<k;i++)
      {
        count=0;
        for(j=0;j<n;j++)
        {
          if(b[i]==a[j]) count++;
        }
        System.out.println(b[i]+" "+count);
      }
    }
}