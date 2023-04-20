package src2.step2;

import java.util.ArrayList;

import common.DirInfo;

public class TestObjectDeSerialization4 {
	public static void main(String[] args) {
		String savePath=DirInfo.OUTPUT_DIR2+"cart.obj";
		CartService service=new CartService(savePath);
		try {
			ArrayList<Product> list=service.cartDeSerial();
			System.out.println("**cart.obj로부터 역직렬화하여 객체로 복원 후 출력해본다**");
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
}




