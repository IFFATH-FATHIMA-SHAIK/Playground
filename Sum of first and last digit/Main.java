import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum,q=0,rem=0;
      rem=n%10;
      while(n>0)
      {
        q=n%10;
         n=n/10;
      }
      sum=rem+q;
      System.out.println(sum);
	}
}