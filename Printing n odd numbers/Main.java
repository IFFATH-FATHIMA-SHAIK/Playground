import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,count=0;
      for(i=0;count<n;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          count++;
        }
      }
	}
}