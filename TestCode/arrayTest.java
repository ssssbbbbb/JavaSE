
public class arrayTest {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][];	//�����ʼ����������arr1,����Ԫ�ص�Ĭ��ֵΪnull
		System.out.println(arr1);	//[[I@5e265ba4
		System.out.println(arr1[0]);	//null
		//�������Ԫ�������Ѿ���ʼ���ˣ�������Ϊ����Ϊ2�����飬ֵΪĬ��ֵnull
		
		//�����ʼ���������Ԫ��
		arr1[0] = new int[1];
		System.out.println(arr1[0]);  //[I@156643d4	
		
		int[][] arr2 = new int[2][2];
		System.out.println(arr2[0][0]);	//0
	}
}
