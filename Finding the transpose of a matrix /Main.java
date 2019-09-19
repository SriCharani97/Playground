import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
     int sum[][] = new int[column_size][row_size];
    for(int i = 0; i <row_size; i++){
      for(int j = 0; j <column_size ; j++)
      {
        sum[j][i] = matrix1[i][j];
      }
    }
    for(int i = 0; i <column_size; i++){
      for(int j = 0; j <row_size; j++)
      {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    
  }
}
}