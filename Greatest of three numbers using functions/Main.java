import java.util.Scanner;
class Main{
  public static int gretest(int a,int b)
{
  int x;
  if(a>b)
  {
    x=a;
  }
  else
  {
    x=b;
  }
  return x;
}

	public static void main (String[] args){
	    // Type your code hereint n1=sc.nextInt();
      Scanner sc=new Scanner(System.in);
      int y;
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      y=gretest(n1,n2);
      if(n3>y)
      {
        System.out.println(n3);
      }
      else
      {
        System.out.println(y);
      }
	}
}