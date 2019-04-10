import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,count=0;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        { 
          count++;
          if(count%2==1)
          System.out.print("*");
          else System.out.print("#");
        }
        System.out.println();
      }
    }
}