import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      int i;
      boolean pal=false;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n/2;i++)
      {
        if(a[i]==a[n-i-1]) pal=true;
        else pal=false;
      }
      if(pal) System.out.print("Yes");
      else System.out.print("No");
    }
}