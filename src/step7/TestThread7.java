package src.step7;

import step7.ServerWorker;

/**
 * 다음주 네크워크 시간에 만들 채팅 서버 프로그램에서 적용될 스레드 연습 
 * 
 * step6 의 채팅 클라이언트의 수신(입력) 스레드와 발신(출력) 스레드는 각각의 업무가 달라서 
 * ReceiverWorker , SenderWorker 와 같이 별도의 클래스 정의되어 스레드로 실행되어야 했다 
 * 
 * step7의 채팅 서버는  서비스 내용 ( 채팅 서비스 ) 이 동일하다. 
 * ServerWorker 클래스 하나만 있으면 된다 
 * 접속해서 서비스 받을 클라이언트의 수만큼 ServerWorker 스레드를 생성해 실행시켜야 
 * 동시에 서비스가 가능하다 
 * 
 * 클라이언트가 3명 -> ServerWorker Thread 3명이 되어야 한다 
 * 
 * 채팅 서버의 일 -> 2가지 종류가 있다 
 * 1. 개별 클라이언트에게 채팅 서비스하는 직원 스레드 ( ServerWorker thread ) 
 * 2. 직원 스레드를 생성하고 start 시키는 사장 스레드 ( main thread ) 
 * 
 */
public class TestThread7 {
	public void service() {
		//다음주 -> 클라이언트가 접속하면 대기하다가 담당 직원 스레드를 생성해 실행가능상태로 보낸다 
		//지금은 3명의 클라이언트가 접속했다고 가정하고 3개 직원 스레드 생성해 start 
		for(int i=1;i<4;i++)
		new Thread(new ServerWorker(),i+"번").start();
	}
	public static void main(String[] args) {
		// 메인 스레드 -> 직원 채용 ( 직원 스레드 생성 ) 해 일하게 한다 ( start ) 
		System.out.println("main thread 시작");  
		TestThread7 mainThread=new TestThread7();
		mainThread.service();
		System.out.println("main thread 종료");
	}
}








