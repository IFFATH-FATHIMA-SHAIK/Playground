import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    int i,j=0,k=0;
    int[] even=new int[n];
    int[] odd=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int rot=s.nextInt();
    for(i=0;i<n;i++)
    {
      if(i%2==0)
      {
        odd[k]=a[i];
        k++;
      }
      else
      {
        even[j]=a[i];
        j++;
      }
    }
    left(odd,k);
    for(i=1;i<=rot;i++)
      left(even,j);
    for(i=0;i<n;i++)
    {
      if(i<k)
      System.out.print(odd[i]+" ");
      if(i<j)
      System.out.print(even[i]+" ");
    }
  }
    static void left(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
}