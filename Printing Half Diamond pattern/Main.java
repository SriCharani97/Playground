import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;++r)
      {
      for(int s=1;s<=n-r;s++)
      {
      System.out.print(" ");
      }
        for(int col=1;col<=(2*r-1);++col)
        {
        System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}