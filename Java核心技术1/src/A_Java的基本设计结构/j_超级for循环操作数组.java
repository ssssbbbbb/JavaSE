package A_Java的基本设计结构;

public class j_超级for循环操作数组 {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6,7,8,9,10};	//10
		System.out.println(i.length);
		
		// 在这里，整型变量就会依次读取数组i里面的元素，然后利用println方法输出
		for (int values : i) {
			System.out.println(values);
		}
	}
}
