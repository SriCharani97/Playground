import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=1;
      for(num=1;num<=n;num++)
      {
      if(num%2!=0)
      { System.out.println(num);}
      }
	}
}