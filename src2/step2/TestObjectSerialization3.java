package src2.step2;

import java.util.ArrayList;

import common.DirInfo;

public class TestObjectSerialization3 {
	public static void main(String[] args) {
		String savePath=DirInfo.OUTPUT_DIR2+"cart.obj";
		CartService service=new CartService(savePath);
		try {
			ArrayList<Product> list=new ArrayList<Product>();
			list.add(new Product(1,"새우깡","농심",1300));
			list.add(new Product(2,"감자깡","농심",1400));
			list.add(new Product(3,"양파깡","농심",1500));
			service.cartSerial(list);
			System.out.println("cart list를 직렬화하여 cart.obj에 저장");
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
}




