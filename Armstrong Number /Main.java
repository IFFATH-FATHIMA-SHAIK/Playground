import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int tn=n;
      int rem=0,sum=0;
      while(n>0)
      {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
	  }
      if(tn==sum) System.out.println("Armstrong Number");
      else System.out.println("Not a Armstrong Number");
    }
}