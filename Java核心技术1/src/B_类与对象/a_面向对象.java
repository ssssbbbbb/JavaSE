package B_类与对象;

class a_面向对象 {
	public static void main(String[] args) {
		//先选商品
		Item I1 = new Item();
		I1.name = "orange";
		I1.JG = 100.98;
		I1.SL = 3;
		
		//下订单前需要地址、付款、账号、和商品名字
		ccount C1 = new ccount();
		C1.C = "110911";
		Payment P = new Payment();
		P.P1 = true;
		ShippingAddress S1 = new ShippingAddress();
		S1.address = "天津";
		
		//订单
		Order O = new Order();
		O.MyOrder(P, S1, C1, I1);
		
	}
}

class Item {
	//商品类
	String name;
	double JG;//价格
	int SL;//数量
	 
}
class Order {
	//订单
	public void MyOrder(Payment P,ShippingAddress S,ccount C,Item I) {
		System.out.println(C.C+"买的"+I.name);
		if (P.P1){
			System.out.print("已经付款"+"待会送到"+S.address);
		}else {
			System.out.print("没有付款");
		}	
	}
}
class ShippingAddress{
	//送货地址
	String address;
}
class Payment{
	//付款
	boolean P1;
}
class ccount{
	//账号
	String C;
}