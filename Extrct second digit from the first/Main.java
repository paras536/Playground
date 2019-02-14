import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=1;
    int temp=n;
    while(n>0)
    {
     n = n/10;
      count=count*10;
    }
    count=count/100;
    int n1=temp/count;
    int n2=n1%10;
    System.out.println(n2);
  }
}
