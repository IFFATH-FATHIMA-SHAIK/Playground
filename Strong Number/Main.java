import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int tn=n;
      int i,rem=0,sum=0,fact=1;
      while(n>0)
      {
        rem=n%10;
         n=n/10;
        for(i=1;i<=rem;i++) fact=fact*i;
        sum=sum+fact;
        fact=1;
      }
      if(tn==sum) System.out.println("Yes");
      else System.out.println("No");
   }
}