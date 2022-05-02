
public class 值传递 {

	public static void main(String[] args) {
		//需要在method方法被调用之后，仅打印出a=100，b==200，请写出method方法的代码。
		int a=10;
		int b=10;
		method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

/*	这种方法，就是在method()方法执行了输出语句后就终止代码，不运行main函数后面的输出语句
 * 
 */
 	private static void method(int a, int b) {
			a = a*10;
			b = b*20;
			System.out.println(a);
			System.out.println(b);
			System.exit(0);			//此方法调用类运行时间中的退出方法。此方法永远不会正常返回，非零状态代码表示异常终止。	
		}
 
		
}
	

