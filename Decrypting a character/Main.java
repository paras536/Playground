import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int key=sc.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        int offset=ch-'a';
        offset=(offset-key+26)%26;
        ch=(char)(offset + 'a');
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset=ch-'A';
        offset=(offset-key)%26;
        ch=(char)(offset + 'A');
      }
      System.out.println(ch);
    }
}