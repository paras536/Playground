import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    for(int i=2;i<=n;i++)
    {
      prime(i);
    }
	}
  public static void prime(int a)
  {
    int found=1;
    for(int j=2;j<=a/2;j++)
    {
      //found=1;
      if(a%j==0)
      {
        found=0;
        break;
      }
     
    }
    if(found==1)
    {
      System.out.println(a);
    }
  }
}