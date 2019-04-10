import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      int i,j;
      for(i=r;i>0;i--)
      {
        for(j=c;j>0;j--)
        {
          if(i>=j) System.out.print(i);
          //else if(i>j) System.out.print(i+1);
          else System.out.print(j);
        }
        System.out.println();
      }
    }
}