import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:
          int s=sc.nextInt();
          System.out.println(s*s);
          break;
        case 2:
          int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(l*b);
          break;
        case 3:
          int base=sc.nextInt();
          int h=sc.nextInt();
          System.out.println((base*h)/2);
          break;
        case 4:
          int rad=sc.nextInt();
          double area;
          area=3.14*rad*rad;
          System.out.println(area);
          break;
      }
    }
}