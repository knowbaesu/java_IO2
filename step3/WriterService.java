package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterService {
	private String filePath;

	public WriterService(String filePath) {
		this.filePath = filePath;
	}

	/*
	 * FileWriter 와 PrintWriter 를 이용 filePath 에 파일에 매개변수 정보를 기록 ( 실행시마다 누적되도록 한다 )
	 * Exception은 throws 한다 반드시 프로세싱 스트림은 close 하도록 한다
	 */
	public void outputMovie(String movieInfo) throws IOException {
		// local variable 은 block level 즉 선언된 자신의 실행 영역에서만
		// 사용 가능 ( finally에서 pw를 사용하기 위해 try 위에서 선언하고
		// 초기화한다 : local variable은 반드시 명시적 초기화가 필요 )
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(filePath, true);
			pw = new PrintWriter(fw);
			pw.println(movieInfo);
		} finally {// 예외 발생, 처리여부와 관계없이 항상 실행한다 
			if(pw!=null)
			pw.close();
		}
	}
}





