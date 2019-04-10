import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int n=gcd(n1,n2);
      n=gcd(n,n3);
      System.out.println(n);
	}
  public static int gcd(int n1,int n2)
  {
    if(n1==0||n2==0) return 0;
    else if(n1==n2) return n1;
    else if(n1>n2) return gcd(n1-n2,n2);
    else return gcd(n1,n2-n1);
  } 
}