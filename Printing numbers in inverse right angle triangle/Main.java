import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int val=n;
      for(int r=1;r<=n;++r)
      {
        for(int col=val;col>=1;col--)
        {
        System.out.print(col);
        }
        val--;
        System.out.print("\n");
      }
	}
}