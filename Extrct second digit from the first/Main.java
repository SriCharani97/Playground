import java.util.Scanner;
class Main
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>10000)
    {int p=n/1000;
    int q=p%10;
    System.out.println(q);
    }
  else if(n>10)
  {
  int r=n%10;
    System.out.println(r);
  }
  }
}