import java.util.Scanner;
class Main{
      public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      for(int n=1;n<=num;n++)
      {
      if(num%n==0)
        System.out.println(n);
      }
	}
}