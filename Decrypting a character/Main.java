import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch;
      ch=sc.next().charAt(0);
      int key=sc.nextInt();
      for(int i=1;i<=key;i++){
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
      {
        ch=(char)(ch-1);
        if(ch<97&&ch>90) ch='z';
        else if(ch<65) ch='Z';
      }
      }
      System.out.print(ch);
    }
}