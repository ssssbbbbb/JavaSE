package B_�������;

class a_������� {
	public static void main(String[] args) {
		//��ѡ��Ʒ
		Item I1 = new Item();
		I1.name = "orange";
		I1.JG = 100.98;
		I1.SL = 3;
		
		//�¶���ǰ��Ҫ��ַ������˺š�����Ʒ����
		ccount C1 = new ccount();
		C1.C = "110911";
		Payment P = new Payment();
		P.P1 = true;
		ShippingAddress S1 = new ShippingAddress();
		S1.address = "���";
		
		//����
		Order O = new Order();
		O.MyOrder(P, S1, C1, I1);
		
	}
}

class Item {
	//��Ʒ��
	String name;
	double JG;//�۸�
	int SL;//����
	 
}
class Order {
	//����
	public void MyOrder(Payment P,ShippingAddress S,ccount C,Item I) {
		System.out.println(C.C+"���"+I.name);
		if (P.P1){
			System.out.print("�Ѿ�����"+"�����͵�"+S.address);
		}else {
			System.out.print("û�и���");
		}	
	}
}
class ShippingAddress{
	//�ͻ���ַ
	String address;
}
class Payment{
	//����
	boolean P1;
}
class ccount{
	//�˺�
	String C;
}