package src.step4;

import step4.VideoWorker;

/*
 *   멀티 스레드 : 메인 스레드 + 영상 스레드 + 음향 스레드 => 동영상 프로세스
 */
public class TestThread4 {
	public static void main(String[] args) {
		VideoWorker videoWorker=new VideoWorker();
		Thread videoThread=new Thread(videoWorker,"봉준호");
		videoThread.start();
		Thread audioThread=new Thread(new AudioWorker(),"아이유");
		audioThread.start();		
		System.out.println("main thread 종료");
	}
}
