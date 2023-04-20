package step5;

import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

import common.DirInfo;

public class TestReader2 {
	public static void main(String[] args) {
		InputService service = new InputService();
		String filePath = DirInfo.OUTPUT_DIR + "저녁메뉴.txt";
		try {
			TreeSet<String> set = service.getMenuKindInfo(filePath);
			Iterator<String> it = set.iterator();
			// 저녁메뉴.txt 의 메뉴 종류 목록이 정렬되어 출력된다
			while (it.hasNext())
				System.out.println(it.next());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
