package A_Java的基本设计结构;

public class g_数值之间的转换 {
	public static void main(String[] args) {
		int i = 3;
		double d = 3.14;
		// i = i + d;	类型不匹配：不能从 double 转换为 int;这种情况就只能强制转换，但代价是失去精度，小数位的数全部没了
		d = i + d;
	}
}
