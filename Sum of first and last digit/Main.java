import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>10000)
      {
      int p=n/10000;
      int q=n%10;
      int sum=p+q;
      System.out.println(sum);
      }
      else if(n>1000)
      {
      int a=n/1000;
        int b=n%10;
        int sub=a+b;
        System.out.println(sub);
      }
      }
}