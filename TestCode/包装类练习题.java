import java.nio.charset.Charset;

public class ��װ����ϰ�� {
	public static void main(String[] args) {		
		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(3.14);
		//�ʣ������������ӡ����ʲô
		System.out.println(o2);
		
		System.out.println("����2------------------")
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		// false ���� true
		System.out.println(i == j);		//��������������ȣ���˱ȵ�������ֵ
		
		Integer m = 1;
		Integer n = 1;
		// false ���� true
		System.out.println(m == n);
		
		Integer x = 128;
		Integer y = 128;
		// false ���� true
		System.out.println(x == y);
		/*	Integer�ڲ�������IntegerCache�ṹ��IntegerCache�ж�����Integer[],
		 * 	�����˴�-128~127��λ���������������ʹ���Զ�װ��ķ�ʽ����Integer���Ƶķ�Χ��-128~127
		 * 	��ô�Ϳ���ֱ��ʹ�������е�Ԫ�أ�������ȥnew�ˡ�
		 * 	Ŀ�ģ����Ч�ʣ�
		 */
		
	}
}
