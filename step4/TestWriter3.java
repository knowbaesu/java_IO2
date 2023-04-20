package step4;

import java.io.IOException;

import common.DirInfo;

public class TestWriter3 {
	public static void main(String[] args) {
		String filePath=DirInfo.OUTPUT_DIR+"저녁메뉴.txt";
		MenuService service=new MenuService();
		//try
		try {
			service.orderMenu(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//catch
		
	}
}
