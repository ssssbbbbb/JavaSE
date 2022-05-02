package A_Java的基本设计结构;

public class l_多维数组 {
	public static void main(String[] args) {
		int arr[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};//这样子就创建了一个arr[3][5]的二维数组，3代表最外面的数组内的元素个数（大数组内的小数组个数），5代表最内层数组的元素个数
		
		//for 超级循环语句不能自动处理二维数组的每一个元素。它是按照行，也就是一维数组处理的。要想访问二维数组a的所有元素，需要使用两个嵌套的循环
		for (int[] x:arr) {
			for (int y : x ) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		/*  1 2 3 4 5 
			6 7 8 9 10 
			11 12 13 14 15 
		*/
	}
}
