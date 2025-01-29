
import java.util.*;
public class TheStateofWakanda {
  public static void main(String args[]) {
  int[][] matrix = {  
  {1,   2,  3},  
  {4,   5,  6},  
  {7,   8,  9},  
  {10, 11, 12}
  };
      int n=matrix.length;
      int m=matrix[0].length;
      for(int i=0;i<m;i++)
      {
          if(i%2==0)
          {
              for(int j=0;j<n;j++)
              {
                  System.out.println(matrix[j][i]);
              }
          }
          else{
              for(int k=n-1;k>=0;k--)
              {
                  System.out.println(matrix[k][i]);
              }
          }
      }
  }
}