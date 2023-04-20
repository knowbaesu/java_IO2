package step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.DirInfo;

public class TestReader {
	public static void main(String[] args) {
		String filePath=DirInfo.OUTPUT_DIR+"점심메뉴.txt";
		try { // 노드 스트림 : 직접 장치(파일)에 연결되는 스트림 
			FileReader fr=new FileReader(filePath);
			//프로세싱 스트림 : 다양한 기능을 지원 
			BufferedReader br=new BufferedReader(fr);
			
			while(br.ready()) //읽을 정보가 있으면 true 
			System.out.println(br.readLine());//한 라인씩 읽는다 
			
			br.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}










