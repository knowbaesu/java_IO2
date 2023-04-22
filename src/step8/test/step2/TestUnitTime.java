package src.step8.test.step2;

import java.text.SimpleDateFormat;

/*
 * 파일 생성과 이동시 파일명이 중복될 수 있으므로 
 * 파일 생성 시간을 파일명에 추가하여 정상적으로 실행되도록 하기 위한 테스트
 * 
 * System.currentTimeMillis() : 반환되는 타입이 long 형인 시간정보 
 * 									 세계 표준시 기준으로 몇 밀리세컨드가 흘렀는지 기록된 값
 * SimpleDateFormat 을 이용해 사람이 확인할 수 있는 정보로 볼 수 있다 
 */
public class TestUnitTime {
	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss SSS");
		String fileTime=sdf.format(time);
		System.out.println(fileTime);
	}
}










