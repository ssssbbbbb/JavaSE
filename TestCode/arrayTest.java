
public class arrayTest {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][];	//这里初始化的是数组arr1,里面元素的默认值为null
		System.out.println(arr1);	//[[I@5e265ba4
		System.out.println(arr1[0]);	//null
		//这里外层元素数组已经初始化了，被定义为长度为2的数组，值为默认值null
		
		//这里初始化的是外层元素
		arr1[0] = new int[1];
		System.out.println(arr1[0]);  //[I@156643d4	
		
		int[][] arr2 = new int[2][2];
		System.out.println(arr2[0][0]);	//0
	}
}
