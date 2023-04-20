package step6;

import common.DirInfo;

public class TestInputOutput {
	public static void main(String[] args) {
		//복사할 원본파일경로 
		String orgFilePath=DirInfo.OUTPUT_DIR+"02day-basic-object-class.txt";
		//붙여넣기할 목적지파일경로
		String destFilePath=DirInfo.OUTPUT_DIR2+"cp_02day-basic-object-class.txt";
		FileService service=new FileService();
		try {
		service.copyAndPasteFile(orgFilePath,destFilePath);
		System.out.println("북붙완료");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}







