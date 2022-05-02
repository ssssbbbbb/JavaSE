package A_Java的基本设计结构;// package 包：为了更好地组织类，Java 提供了包机制，用于区别类名的命名空间。类似于文件夹的一种存储空间。

public class a_1最基本的Java程序 {	

	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		/*	一、类的声明
		 *  	public —— 权限修饰符
		 * 		class —— 关键字、这里的作用是用来声明类
		 *  	a_1 —— 类名
		 *  
		 *  二、Java程序的入口
		 *  	public static void main(String[] args)	主函数，虚拟机运行代码的入口
		 *  	1、运行已编译的程序时，Java虚拟机将从指定类中的main方法开始执行,因此为了代码能够执行，在类的源文件中必须包含一个main方法.
		 *  	2、在Java SE 1.4及以后的版本中强制main方法是public的。
		 *  
		 *  三、{}
		 *  	需要注意源代码中的括号{}。在Java中，像在C/C++中一样，用大括号划分程序的各个部分（通常称为块）。Java中任何方法的代码都用“{”开始，用“}”结束。
		 *  
		 *  三、方法
		 *  	System.out.println();
		 *  	其功能是：将一个文本行输出到控制台上，然后换行：在这里，使用了System.out对象并调用了它的println方法。
		 *  	1、System：这是在 java.lang包中定义的最终类。
		 *		2、out：这是PrintStream类型的实例，它是System类的公共和静态成员字段。
		 *		3、println（）：由于 PrintStream类的所有实例都有一个公共方法println（），因此我们也可以对它进行外部调用。
		 *		这是print（）的升级版本。它打印传递给它的所有参数，并在输出中添加新行。我们可以假设System.out代表标准输出流。
		 *  
		 *  四、分号 “ ; ”	
		 *  	每段代码的结束都必须要加上分号，否则语法错误。
		 * */
	}

}
