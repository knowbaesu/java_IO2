package src.step8.test.step1;

import java.util.Random;

/*
 *   확장자 avi , mp3  두 종류의 파일을 랜덤하게 생성 => MakeFileWorker 
 */
public class TestUnitRandom {
	public static void main(String[] args) {
		Random random=new Random();
		String ext=null;
		for(int i=0;i<10;i++) {
			if(random.nextBoolean()) {
				ext=".mp3";
			}else {
				ext=".avi";
			}
			String fileName=i+ext;
			System.out.println(fileName+" music:"+fileName.endsWith(".mp3"));
		}
	}
}








