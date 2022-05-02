package A_Java的基本设计结构;

import java.util.Arrays;

public class k_数组初始化和匿名数组 {
	public static void main(String[] args) {
		// 匿名数组
		int arr[];
		arr = new int[] {1,2,3,4,5};
		
		int arr1[] = {1,2,3,4,5};
		
		int arr2[] = new int[0];
		
		//如果希望将一个数组的所有值拷贝到一个新的数组中去，就要使用Arrays类的copyOf方法：
		arr2 = Arrays.copyOf(arr1, arr1.length+5);
		//第一个参数是需要拷贝的数组，第二个参数是新数组的长度。这个方法通常用来增加数组的大小
		
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			// 输出的值：1、2、3、4、5、0、0、0、0、0
			
			//如果数组元素是数值型，那么多余的元素将被赋值为0；如果数组元素是布尔型，则将赋值为false。相反，如果长度小于原始数组的长度，则只拷贝最前面的数据元素。

		}
	}
}
