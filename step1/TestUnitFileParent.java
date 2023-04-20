package step1;

import java.io.File;

/**
 * 상위 디렉토리 정보를 반환받는 메서드 테스트 
 * @author KOSTA
 *
 */
public class TestUnitFileParent {
	public static void main(String[] args) {
		String path="C:\\kosta260\\iotest1\\구례.txt";
		String dirStr=new File(path).getParent();//상위 디렉토리 정보 문자열이 반환 
		System.out.println(dirStr);
		File dir=new File(path).getParentFile();//상위 디렉토리 정보 파일 객체가 반환
		System.out.println(dir.getPath());// 파일객체로 반환받기 때문에 파일 API 가 제공하는 메서드를 이용할 수 있다 
		dir.listFiles(); // 파일객체로 반환받기 때문에 파일 API 가 제공하는 메서드를 이용할 수 있다 
	}
}








