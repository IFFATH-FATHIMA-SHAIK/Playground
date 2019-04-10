import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=adding(n);
      System.out.println(sum);
	}
  static int adding(int n)
  {
    int i,sum=0;
    for(i=1;i<=n;i++) sum=sum+i;
    return sum;
  }
}