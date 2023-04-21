package step8.test.step3;

import java.io.File;

public class TestMoveFile {
	public static void main(String[] args) {
		// 파일 이동 연습 java.io.File  renameTo() 
		String org="C:\\kosta260\\iotest1\\구례.txt";
		File orgFile=new File(org);
		//원본 파일을 목적지 경로로 이동시킨다 
		String destPath="C:\\kosta260\\iotest2\\구례.txt";
		File destFile=new File(destPath);
		boolean result=orgFile.renameTo(destFile);
		System.out.println("파일 이동 결과:"+result);
	}
}









