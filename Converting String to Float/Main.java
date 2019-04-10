import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    StringBuilder s=new StringBuilder(st);
    double f=0f;
    int slen=s.length();
    for(int i=0;i<slen;i++)
    {
      char temp=s.charAt(i);
      if(temp>'0' && temp<='9'){
      int offset=temp-'0';
        if(i<=2)f=f*10+offset;
        if(i>2) f=f+0.1*offset;
      }
    }
  System.out.printf("%6f",f);    
  }
}