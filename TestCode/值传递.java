
public class ֵ���� {

	public static void main(String[] args) {
		//��Ҫ��method����������֮�󣬽���ӡ��a=100��b==200����д��method�����Ĵ��롣
		int a=10;
		int b=10;
		method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

/*	���ַ�����������method()����ִ��������������ֹ���룬������main���������������
 * 
 */
 	private static void method(int a, int b) {
			a = a*10;
			b = b*20;
			System.out.println(a);
			System.out.println(b);
			System.exit(0);			//�˷�������������ʱ���е��˳��������˷�����Զ�����������أ�����״̬�����ʾ�쳣��ֹ��	
		}
 
		
}
	

