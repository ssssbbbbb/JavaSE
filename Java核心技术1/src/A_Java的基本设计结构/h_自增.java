package A_Java的基本设计结构;

public class h_自增 {
	public static void main(String[] args) {
		int i = 1;
		int x ;
		int y ;
		y = i++;	//先运算后自增
		System.out.println(y);
		x = ++i;	//先自增后运算
		System.out.println(x);
	}
}
