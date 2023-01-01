
import java.io.*;
public class sumofdia
{
	static void Sum_of_Diagonals1(int[][] m, int N)
	{
		
		int dsum=0;
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < N; j++)
			 {

				if (i == j)
				dsum=dsum+ m[i][j];
				
			}
		}

		
		System.out.println("Sum of Principal Diagonal:"+ dsum);
		
	}


	
	public static void main(String[] args)
	{
		int[][] b =		               { { 8, 2, 13, 4 },
					{ 9, 16, 17, 8 },
					{ 1, 22, 3, 14 },
					{ 15, 6, 17, 8 } };
		Sum_of_Diagonals1(b, 4);
	
	}
}
