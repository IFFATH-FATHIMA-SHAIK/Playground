import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exp=s.nextInt();
      int i=1,power=1;
      while(i<=exp)
      {
        power=power*base;
        i++;
      }
      System.out.println(power);
    }
}