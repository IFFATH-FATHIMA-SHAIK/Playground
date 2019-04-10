import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuilder sb=new  StringBuilder(str);
    int i;
    Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
         List<Character> al = Arrays.asList(vowels); 
         for (i = 0; i < sb.length(); i++) { 
             if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
             } 
         }
    System.out.print(sb);
  }
}