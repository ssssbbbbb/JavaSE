package A_Java�Ļ�����ƽṹ;

import java.util.Arrays;

public class k_�����ʼ������������ {
	public static void main(String[] args) {
		// ��������
		int arr[];
		arr = new int[] {1,2,3,4,5};
		
		int arr1[] = {1,2,3,4,5};
		
		int arr2[] = new int[0];
		
		//���ϣ����һ�����������ֵ������һ���µ�������ȥ����Ҫʹ��Arrays���copyOf������
		arr2 = Arrays.copyOf(arr1, arr1.length+5);
		//��һ����������Ҫ���������飬�ڶ���������������ĳ��ȡ��������ͨ��������������Ĵ�С
		
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			// �����ֵ��1��2��3��4��5��0��0��0��0��0
			
			//�������Ԫ������ֵ�ͣ���ô�����Ԫ�ؽ�����ֵΪ0���������Ԫ���ǲ����ͣ��򽫸�ֵΪfalse���෴���������С��ԭʼ����ĳ��ȣ���ֻ������ǰ�������Ԫ�ء�

		}
	}
}
