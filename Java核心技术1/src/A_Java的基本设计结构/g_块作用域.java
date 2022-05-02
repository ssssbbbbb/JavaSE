package A_Java的基本设计结构;
/*	块（即复合语句）是指由一对大括号括起来的若干条简单的Java语句。块确定了变量的作用域。一个块可以嵌套在另一个块中。
 *  下面就是在main方法块中嵌套另一个语句块的示例。
 * 
 */
public class g_块作用域 {
	public static void main(String[] args) {
		System.out.println("一个块");
		int n1 = 90;
		{
			int i1 = 100;
			System.out.println("在main里面的块");
		}
		
	}
}
