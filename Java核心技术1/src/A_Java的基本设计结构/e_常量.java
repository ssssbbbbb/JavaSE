package A_Java�Ļ�����ƽṹ;
/*	һ����Java�У����ùؼ���finalָʾ������
 *  �����ؼ���final��ʾ�������ֻ�ܱ���ֵһ�Ρ�һ������ֵ֮�󣬾Ͳ��ܹ��ٸ����ˡ�ϰ���ϣ�������ʹ��ȫ��д��
 *  ������Java�У�����ϣ��ĳ������������һ�����еĶ��������ʹ�ã�ͨ������Щ������Ϊ�ೣ��������ʹ�ùؼ���static final����һ���ೣ����
 */
public class e_���� {
	public static void main(String[] args) {
		final String NAME = "Tom";
		
		// NAME = "black";	���ܶ�final�ֲ����� NAME ��ֵ��������Ϊ�հף����Ҳ�ʹ�ø��ϸ�ֵ
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