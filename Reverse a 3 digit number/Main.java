import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=n/100;
    int q=((n/10)%10);
    int r=n%10;
    int rev=(r*100)+(q*10)+p;
    System.out.println(rev);
  }
}