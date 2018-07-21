package top.vabook.matrix.printmatrix;
/**
 * @author vabook@163.com
 * @version 2018年7月21日 下午10:21:24
 * 顺时针打印矩阵
 */
public class clockwiseprint {
	
	public static void print(int[][] numbers) {
		if(numbers == null) {
			return ;
		}
		int x = 0;
		int y = 0;
		while(x * 2 < numbers.length && y * 2 < numbers[0].length) {
			printCircle(numbers,x,y);
			x ++;
			y ++;
		}
	}
	public static void printCircle(int[][] numbers, int x , int y) {
		int rows = numbers.length;
		int cols = numbers[0].length;
		
		for(int i = y; i <= cols - y - 1; i++) {
			System.out.println(numbers[x][i] + " ");
		}
		if (rows - x -1 > x) {
			for(int i = x + 1; i <= rows - x - 1; i++) {
				
				System.out.println(numbers[i][cols - y - 1] + " ");
			}
		}
		if (rows - x - 1 > x && cols - 1 -y > y) {
			for(int i = cols -y - 2; i >= y; i --) {
				System.out.println(numbers[rows - 1 - x][i] + " ");
			}
		}
		if (cols -1 -y > y && rows - 1 -x > x + 1) {
			for(int i = rows -1 -x -1;i >= x + 1; i--) {
				System.out.println(numbers[i][y] + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[][] numbers = {
				{1,2,3,4,5}
				,{6,7,8,9,10}
				,{11,12,13,14,15}
		};
		print(numbers);
	}

}
