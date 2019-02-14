import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code hern
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    int max=0;
    int index=0;
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
   for(int i=0;i<n;i++)
   {
     if(list[i]>max)
     {
       max=list[i];
       index=i;
     }
   }
     System.out.println(index);
  }
}