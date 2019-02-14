import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int fact,i,sum=0,rem;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=n;
      while(n>0)
      { 
        rem=n%10;
        fact=1;
        i=1;
        while(i <= rem)
        {
          fact=fact*i;
          i++;
        }
       sum=sum+fact;
        n=n/10;
      }
      if(num==sum)
      {
        System.out.println("Yes");
        
      }
      else
      {
        System.out.println("No");
      }
      }
}