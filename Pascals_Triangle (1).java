//Pascal's Triangle
//Sahithra Kesavan, Period 4
//Code that prints out Pascal's triangle

import java.util.Arrays;

class Pascals_Triangle {
	public static void main(String[] args) 
	{
	   //Testing different numbers of rows
	  //int rows = 1;
       //int rows = 20;
      //int rows = 100;
    int rows = 4;
    int [][] pascalsTri = pascal(rows); // Calling the pascal method with whatever number of rows that I want
		//Print your Triangle here
    for(int r = 0; r < pascalsTri.length; r++) 
      {
        for(int c = 0; c < pascalsTri[r].length; c++)
          {
            System.out.println(pascalsTri[r][c] + "  "); //printing the whole matrix 
          }
      }

  
    
	}


	
	public static int[][] pascal(int rows)
	{

    int[][] tri = new int[rows][]; //Making a 2D array to hold the Triangle
    for(int r = 0; r < rows; r++)
      {
        tri[r] = new int[r+1]; //For every row, adding a column based on the number row it is. 
        tri[r][0] = 1; //Setting the first element to 1
        tri[r][r] = 1; //Setting the last element to 1

        for(int c = 1; c < r; c++)
          {
            tri[r][c] = tri[r-1][c-1] + tri[r-1][c]; //Getting the value in the row before to calculate the numbers in the current row
          
          }
      }
		
		return tri; //returns the triangle array
  	}
}
