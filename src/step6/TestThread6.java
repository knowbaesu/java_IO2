package step6;
/**
 * 다음주 네크워크 시간에 만들 채팅 클라이언트 프로그램에서 적용될 스레드 연습 
 * 채팅 클라이언트 
 * 친구들의 메세지를 서버로부터 입력받은 스레드 
 * 나의 메세지를 서버로 출력하는 스레드 
 * 두가지 스레드가 멀티 스레딩 되어야 한다 
 * ReceiverThread
 * SenderThread  를 만들어 실행시켜본다 
 * @author KOSTA
 *
 */
public class TestThread6 {
	public static void main(String[] args) {
		new Thread(new ReceiverWorker()).start();
		new Thread(new SenderWorker()).start();
		System.out.println("main thread 종료");
	}
}









