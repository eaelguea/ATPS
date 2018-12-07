public class P5MinimumPathSum {
    public static int minPathSum(int[][] grid){
      	int row = grid.length;
	int col = grid[0].length;
      	if(row==0||col==0)return 0;
	for(int i =1;i<row;i++) {
		grid[i][0]=grid[i][0]+grid[i-1][0];
	}
	for(int j=1;j<col;j++) {
		grid[0][j]=grid[0][j]+grid[0][j-1];
	}
	for(int i=1;i<row;i++) {
		for(int j=1;j<col;j++) {
			grid[i][j]=Math.min(grid[i-1][j]+grid[i][j], grid[i][j-1]+grid[i][j]);
		}
	}
	return grid[row-1][col-1];
    }
}
