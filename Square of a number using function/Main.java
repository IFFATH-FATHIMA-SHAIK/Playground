import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sq_v=square(n);
      System.out.println(sq_v);
	} 
  static int square(int n)
  {
    n=n*n;
    return n;
  }
}