import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int n=greatest(n1,n2);
      n=greatest(n,n3);
      System.out.println(n);
	}
  public static int greatest(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else return n2;
  }
}