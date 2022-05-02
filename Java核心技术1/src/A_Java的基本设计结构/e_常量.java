package A_Java的基本设计结构;
/*	一、在Java中，利用关键字final指示常量。
 *  二、关键字final表示这个变量只能被赋值一次。一旦被赋值之后，就不能够再更改了。习惯上，常量名使用全大写。
 *  三、在Java中，经常希望某个常量可以在一个类中的多个方法中使用，通常将这些常量称为类常量。可以使用关键字static final设置一个类常量。
 */
public class e_常量 {
	public static void main(String[] args) {
		final String NAME = "Tom";
		
		// NAME = "black";	不能对final局部变量 NAME 赋值。它必须为空白，并且不使用复合赋值
		System.out.println(NAME+" is SB!");
		
		Test t1 = new Test();
		t1.test1();
	}
}
class Test{
	final String name = "lol";
	final int age = 100;
	
	public void test1() {
		System.out.println(age);
		System.out.println(name);
	}
}