import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    power(b,e);
  }
  public static void power(int x,int y)
  {
    double c=Math.pow(x,y);
    System.out.println(c);
  }
}