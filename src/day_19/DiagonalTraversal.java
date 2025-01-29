public class DiagonalTraversal {

    static void diagonalTraversal(int[][] arr)
    {
      for (int g=0;g<arr[0].length;g++)
      {
          for (int i=0,j=g; j<arr[0].length; i++,j++)
          {
              System.out.println(arr[i][j]);
          }
      }  
    }
    public static void main(String[] args) {
      int[][] array = {
      {1,   2,  3,  4,  5},
      {6,   7,  8,  9, 10},
      {11, 12, 13, 14, 15},
      {16, 17, 18, 19, 20},
      {21, 22, 23, 24, 25}};
      diagonalTraversal(array);
    }
}