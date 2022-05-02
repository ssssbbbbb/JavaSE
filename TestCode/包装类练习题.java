import java.nio.charset.Charset;

public class 包装类练习题 {
	public static void main(String[] args) {		
		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(3.14);
		//问：接下来输出打印的是什么
		System.out.println(o2);
		
		System.out.println("问题2------------------")
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		// false 还是 true
		System.out.println(i == j);		//这里是两个对象比，因此比的是引用值
		
		Integer m = 1;
		Integer n = 1;
		// false 还是 true
		System.out.println(m == n);
		
		Integer x = 128;
		Integer y = 128;
		// false 还是 true
		System.out.println(x == y);
		/*	Integer内部定义了IntegerCache结构，IntegerCache中定义类Integer[],
		 * 	保存了从-128~127方位的整数，如果我们使用自动装箱的方式，给Integer复制的范围在-128~127
		 * 	那么就可以直接使用数组中的元素，不用再去new了。
		 * 	目的：提高效率！
		 */
		
	}
}
