import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code herecann
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      //int n=sc.nextInt();
      
      System.out.println(sum(n));
	}
  public static int sum(int a)
  {
    int som=0;
   for(int i=1;i<=a;i++)
   {
     som=som+i;
   }
    return som;
  }
}