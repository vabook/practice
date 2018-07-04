package top.vabook.matrix;

/**
 * @author vabook@hotmail.com
 * @version 2018年7月4日 下午11:00:00
 *
 */
public class FindInMatrix {

	public static void find(int[][] matrix, int number) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			System.out.println("数组无效");
			return;
		}
		// 行数
		int MaxRow = matrix.length;
		// 列数
		int MaxCol = matrix[0].length;
		
		int row = 0;
		//列初值
		int col = MaxCol - 1 ;
		while(row >= 0 && row < MaxRow && col >= 0 && col < MaxCol){
			if (number == matrix[row][col]) {
				System.out.println("找到了,在" + (row + 1) + "行" +" " + " 第" + (col + 1) + "列");
				return ;
			}else if (number < matrix[row][col]) {
				col -- ;
			}else {
				row ++ ;
			}
			
		}
		System.out.println("没有找到啊,你好好看看有没有!");
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int numbers = 10;
		find(matrix, numbers);
		find(matrix ,18);
		find(null, 1);
	}

}
