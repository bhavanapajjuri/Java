import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//2 d array initalization
		int[][] grid = {
				{5,6,7},
				{3,9,4,7}
		};
		
		//printing 2-d array where i - rows j- col
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Entr number of rows :");
		int noRows = s.nextInt();
		System.out.println("Enter number of columns :");
		int noCols = s.nextInt();
		
		int[][] multiArray = new int[noRows][noCols];
		System.out.println("Enter array elements - ");
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				multiArray[i][j] = s.nextInt();
			}
		}
		System.out.println("the 2-D Array - ");
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				System.out.print(multiArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
