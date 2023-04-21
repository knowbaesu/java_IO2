package step5;
/*
 Daemon Thread 데몬 스레드: 자신을 실행시킨 스레드가 종료되면 함께 종료되는 스레드 
  ex) 백업 작업,   워드 프로세스 작업시  1분에 한번 백업 작업이 진행되도록 처리 
   -> 워드 작업 종료되어 프로세스가 종료되면 백업 작업도 함께 종료되어야 한다 
  
  워드 스레드 시작 시점에 백업 스레드도 함께 시작되도록 한다
  워드작업은 1초 단위로 실행 ,  백업작업은 3초 단위로 실행 
   
 */
public class TestThread5 {
	public static void main(String[] args) {
		Word word=new Word();
		Thread wordThread=new Thread(word);
		wordThread.start();
		System.out.println("메인 스레드 종료");
	}
}
