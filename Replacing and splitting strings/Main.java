import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int parts=sc.nextInt();
      s2.replace(s1, s2);
      String[] split=s2.split(" ");
      for(String s:split)
      {
      System.out.println(s);
      }
    }
}