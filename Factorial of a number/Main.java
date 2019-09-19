import java.util.Scanner;
class Main{

      public static void main (String[] args){
        // Type your code here
      int fact=1;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n>1)
      {
      fact=fact*n;
        n--;
      }
      System.out.println(fact);
	}
}