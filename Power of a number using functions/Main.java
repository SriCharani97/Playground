import java.util.*;
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int b=sc.nextInt();
  int e=sc.nextInt();
  System.out.print(pow(b,e));
}
  public static int pow(int b,int e)
  {
  int p=1;
    while(e>=1)
    {
    p=p*b;
      e--;
    }
    return p;
  }
}