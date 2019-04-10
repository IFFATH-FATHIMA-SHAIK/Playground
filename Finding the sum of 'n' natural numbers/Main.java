import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long s=sum(n);
  System.out.print(s);
  }
  static int sum(int n)
  {
    if(n==0) return 0;
    else{
      return n+sum(n-1);
    }
}
}