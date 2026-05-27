// only applicable for nxn matrix
//time comp=O(n) (For this Optimised Approach)
public class diagonalSumOA{
	public static int staircaseSearch(int matrix[][], int key){
		int row = 0; col = matrix[0].length-1;
		while(row < matrix.length && col >= 0){
			if(matrix[row][col] == key){
				System.out.println("Found key at (" + row + "," + col + ")");
				return true;
			}
			else if(key < matrix[row][col]){
				col--;
			}
			else{
				row++;
			}
		}
		System.out.println("Key not found");
	}
	

	public static void main(String[] args){
		//each el. below and to the right of any given el is bigger than the el. under consideration
		int matrix[][] = {{10, 20, 30, 40},
					  {15, 25, 35, 45},
					  {27, 29, 37, 48},
					  {32, 33, 39, 50}};
		int key=33;
		staircaseSearch(matrix,key);
	}
}