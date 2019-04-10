import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int i,j;
      for(i=0;i<n;i++) a[i]=s.nextInt();
      int first=s.nextInt();
      int second=s.nextInt();
      boolean flag=false,flag2=false;
      for(i=0;i<n;i++)
      {
        if(first==a[i])
        {
          flag=true;
          break;
        }
      }
      for(j=0;j<n;j++)
      {
        if(second==a[j])
        {
          flag2=true;
          break;
        }
      }
      if(flag) System.out.println(i);
      else System.out.println(-1);
      if(flag2) System.out.println(j);
      else System.out.println(-1);
    }
}