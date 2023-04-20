package step2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import common.DirInfo;

// 문자열(2byte 단위) 출력 스트림 활용
public class TestWriter {
	public static void main(String[] args) {
		try {
			//직접 장치(파일)에 연결되는 노드 스트림 계열 
			FileWriter fw=new FileWriter(DirInfo.OUTPUT_DIR+"친구.txt",true);//true : append
			//다양한 기능을 제공하는 프로세싱 스트림 계열 
			PrintWriter pw=new PrintWriter(fw);
			pw.println("손흥민");
			pw.close();//close() : 스트림을 닫아준다 , 이 때 버퍼에 있는 데이터가 출력된다( flush )  
			System.out.println("출력 작업완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





