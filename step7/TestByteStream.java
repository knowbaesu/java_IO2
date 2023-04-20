package step7;

import common.DirInfo;

// 1byte Stream ( 바이트 스트림 ) 을  이용해 이미지 파일 복사하고 붙여넣기 해본다
public class TestByteStream {
	public static void main(String[] args) {
		//복사할 원본파일경로 
		String orgFilePath=DirInfo.OUTPUT_DIR+"iu.jpg";
		//붙여넣기할 목적지파일경로
		String destFilePath=DirInfo.OUTPUT_DIR2+"cp_iu.jpg";
		ImgService service=new ImgService();
		try {
		service.copyAndPasteImage(orgFilePath,destFilePath);
		System.out.println("이미지 복붙완료");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}











