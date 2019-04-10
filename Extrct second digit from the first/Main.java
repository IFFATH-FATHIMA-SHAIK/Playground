import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sec=0;
    while(n>10)
    {
      sec=n%10;
      n=n/10;
    }
    System.out.println(sec);
  }
}