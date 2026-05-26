// only applicable for nxn matrix
//time comp=O(n^2) (For this Brute Force Approach)
public class diagonalSum{
	public static int diagonalSum(int matrix[][]){
		int sum = 0;

		for(int i=0; i<matrix.length; i++){
			
			for(int j=0; j<matrix[0].length; j++){
				//for primary diagonal
				if(i==j){
					sum += matrix[i][j];
				}
				//for secondary diagonal(sum of i(row no.) & j(col no.) is n-1 for nxn matrix where n=i=j=rows=column)
				else if(i+j ==matrix.length-1){
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}
	

	public static void main(String[] args){
		int matrix[][] = {{1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {9, 10, 11, 12},
					  {13, 14, 15, 16}};	
		System.out.println(diagonalSum(matrix));
	}
}