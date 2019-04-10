import java.util.*;
class Main
{
  public static int powerOfBase(int base,int exp)
  {
    int res=1;
    while(exp>0)
    {
      res=res*base;
      exp--;
    }
    return res;
  }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int base=s.nextInt();
    int exp=s.nextInt();
    int res=powerOfBase(base,exp);
    System.out.println(res);
  }
}