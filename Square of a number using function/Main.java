import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  int 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(square(n));
	} 
  public static int square(int num)
  {
    int sq=num*num;
    return sq;
  }
}