package step1;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		
		String path="C:\\kosta260\\iotest1\\구례.txt";
		//path에 해당하는 파일이 존재하는 지 확인
		System.out.println(new File(path).exists());
		//파일인지 디렉토리인지 확인
		System.out.println(new File(path).isFile());//true
		System.out.println(new File(path).isDirectory());//false
		//특정 파일이 있는 디렉토리의 파일명들을 출력한다 
		//path : 파일 경로 -> 구례.txt가 속한  iotest1 디렉토리가 가지고 있는
		//						  파일명들을 출력한다( 디렉토리는 제외 ) 
		//1. 그 파일의 상위 디렉토리를 반환받을 수 있는 메서드를 api 에서 검색 
		//	  getParent() : String ,  getParentFile() : File []  차이점 확인 
		//	  -> 단위 테스트 TestUnitFileParent 에서 먼저 확인한다 		
		//2. 디렉토리 정보를 기반으로 한 파일 객체를 생성해서 listFiles() : File [] 
		//   이용해 디렉토리를 제외한 파일명들을 출력한다 
		File files[]=new File(path).getParentFile().listFiles();
		for(int i=0;i<files.length;i++) {
			if(files[i].isFile())
			System.out.println(files[i].getName());
		}
	}
}










