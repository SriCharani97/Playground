import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int p=(i%100)/10;
      System.out.println(p);
	}
}