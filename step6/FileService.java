package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	/*
	 * 복사 붙여넣기 작업을 하는 메서드 출력할 destFilePath 의 상위 디렉토리가 존재하지 않는다면 동적으로 디렉토리를 생성한다
	 * orgFilePath 파일의 정보를 문자열 입력스트림 ( FileReader < BufferedReader ) 을 이용해 입력받아
	 * destFilePath 파일로 문자열 출력스트림 ( FileWriter < PrintWriter ) 를 이용해 출력한다
	 */
	public void copyAndPasteFile(String orgFilePath, String destFilePath) throws IOException {
		// 디렉토리가 존재하지 않으면 생성
		File destDir = new File(destFilePath).getParentFile();
		if (destDir.isDirectory() == false)
			destDir.mkdirs();
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(orgFilePath));
			pw = new PrintWriter(new FileWriter(destFilePath));
			while(br.ready()) { // data가 존재할때까지 true , 반복됨 
				pw.println(br.readLine());//한 라인씩 읽어서 한 라인씩 출력한다 
			}
		} finally {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
		} // finally
	}// method
}// class



