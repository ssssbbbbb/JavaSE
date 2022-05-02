package A_Java的基本设计结构;
/*	
 * 一、在Java中，浮点数据有两种类型：float、double
 * 		其中，double的取值范围比float大，数值精度是float的两倍，因此他们有另外的名称：float（单精度浮点数） 和 double（双精度浮点数）
 * 二、取值范围
 * 		float  占四字节   取值范围：大约3.40282347E+38F，有效位数为6-7位
 * 		double  占八字节   取值范围：大约1.79769313486231570E+308，有效位数为15位
 * 三、默认浮点数
 * 		float类型的数值有一个后缀F或f（例如，3.14F）。没有后缀F的浮点数值（如3.14）默认为double类型。当然，也可以在浮点数值后面添加后缀D或d（例如，3.14D）
 * */
public class d_浮点类型 {
	public static void main(String[] args) {
		
		float f1 = 3.14f;
		double d1 = 3.1415967;
		
		System.out.println(f1);
		System.out.println(d1);
	}
}
