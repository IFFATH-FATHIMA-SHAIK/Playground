import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int rem=0,sum=0;
      while(n>0)
      {
        rem=n%10;
        n=n/10;
        sum=sum+rem;
      }
      System.out.println(sum);
	}
}