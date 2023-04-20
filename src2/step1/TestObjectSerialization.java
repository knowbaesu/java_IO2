package src2.step1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import common.DirInfo;

public class TestObjectSerialization {
	public static void main(String[] args) {
		//객체 직렬화 : Person 객체 생성 후 person.obj 에 메모리 상에 있는 
		// Person 객체를 직렬화하여 전송, 저장한다 
		Person p=new Person("안정환",900,"king");
		String personPath=DirInfo.OUTPUT_DIR2+"person.obj";
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(personPath));
			oos.writeObject(p);
			oos.close();
			System.out.println(p+" 객체 직렬화하여 파일에 저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








