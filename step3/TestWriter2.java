package step3;

import java.io.IOException;

import common.DirInfo;

public class TestWriter2 {
	public static void main(String[] args) {
		String filePath=DirInfo.OUTPUT_DIR+"영화.txt";
		WriterService service=new WriterService(filePath);
		String movieInfo="인셉션";
		//try
		try {
			service.outputMovie(movieInfo);
			//후속작업
			System.out.println("영화정보 출력완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






