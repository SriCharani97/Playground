import java.util.Scanner;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=3;
    for(int stc=1;stc<=n;stc++)
    {
    System.out.print(stc);
      if((stc%m==0)&&(stc!=n))
      {
      System.out.print(",");
      }
    }
  }
}