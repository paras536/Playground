import java.util.Scanner;
class Main{
public static void right_sum(int n,int ar[],int val)
{
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(ar[i]+ar[j]==val)
      {
        System.out.println(ar[i]+", "+ar[j]);
        
      }
    }
  }
}
  public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
      }
      int val=sc.nextInt();
    right_sum(n,ar,val);
    }
}