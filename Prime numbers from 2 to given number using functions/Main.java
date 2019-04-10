import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      primeSeries(n);
	}
 public static void primeSeries(int n)
{
    int i,j,flag;
    for(i=2;i<n;i++)
    {
      flag=0;
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0) 
          System.out.println(i);
    }
  }
}