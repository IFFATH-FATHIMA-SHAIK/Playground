import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
          System.out.print(" ");
        for(j=1;j<=i;j++)
        {
          System.out.print(k+" ");
          k++;
        }
       System.out.println();
      }
    }    
}