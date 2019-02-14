import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n%10;
      int n2;
      int count=1;
      int temp=n;
      while(temp>0)
      {
       temp = temp/10;
        count= count*10;
        
      }
      count = count/10;
      n2=n/count;
      int sum=n1+n2;
      System.out.println(sum);
	}
}