public class Q3 {
    void rotate(int matrix[][]) 
   {
       var rotatedMatrix = new int[matrix.length][matrix.length];
              
       // rotate
      for(var i=0;i<matrix.length;i++)
      {
          for(var j=0;j<matrix.length;j++)
         { 
             rotatedMatrix[i][j] = matrix[j][matrix.length-1-i];
         }
      }
    
      for(var i=0;i<matrix.length;i++)
      {
          for(var j=0;j<matrix.length;j++)
         { 
             matrix[i][j] = rotatedMatrix[i][j];
         }
      }
      
   }
}
    

