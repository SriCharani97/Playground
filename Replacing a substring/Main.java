import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String sr = scan.nextLine();
    String si = scan.nextLine();
    System.out.println(str.replace(sr,si));
    }
}