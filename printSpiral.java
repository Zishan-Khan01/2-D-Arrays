

public class printSpiral{
	public static void printSpiral(int matrix[][]){
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length-1;
		int endCol = matrix[0].length-1;

		while(startRow <= endRow && startCol <= endCol){
			//printing top boundary
			for(int j=startCol; j<=endCol; j++){
				System.out.print(matrix[startRow][j]+" ");
			}
			System.out.println();

			//printing right boundary
			for(int i=startRow+1; i<=endRow; i++){
				System.out.print(matrix[i][endCol]+" ");
			}
			System.out.println();

			//printing bottom boundary
			for(int j=endCol-1; j>=startCol; j--){
				if(startRow == endRow){
					break;
				}
				System.out.print(matrix[endRow][j]+" ");
			} 
			System.out.println();

			//printing left boundary
			for(int i=endRow-1; i>startRow; i--){
				if(startCol == endCol){
					break;
				}		
				System.out.print(matrix[i][startCol]+" ");
			}
			

			startCol++;
			startRow++;
			endRow--;
			endCol--;
			
		}
		
	}
	

	public static void main(String[] args){
		int matrix[][] = {{1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {9, 10, 11, 12},
					  {13, 14, 15, 16}};
		

		
		printSpiral(matrix);
	}
}