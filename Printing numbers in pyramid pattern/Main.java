import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=1;
      for(int r=1;r<=n;++r)
      {
      for(int s=1;s<=(n-r);s++)
      {
      System.out.print(" ");
      }
        for(int col=1;col<=r;++col)
        {
        System.out.print(num);
          num=num+1;
          System.out.print(" ");
        }
        System.out.print("\n");
      }
    }    
}