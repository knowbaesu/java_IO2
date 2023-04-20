package src2.step3;
/*
 *  Process : 현재 실행중인 프로그램 ( 옷 )  
 *  Thread : Process 내부의 세부적 실행단위 
 *             사전적 의미 ->( 실 )  
 *  		   여러개의 실이 모여 옷을 구성한다 
 *  		   여러개의 스레드가 실행되어 하나의 프로세스를 구성한다 
 *  		   카톡 실행 -> 카톡 프로세스 
 *  		   친구들 메세지를 입력 -> 입력 스레드 
 *  		   내 메세지를 친구들에게 출력 -> 출력 스레드 
 *  		   유투브 프로세스 ( 영상 스레드 + 음향 스레드 + 자막 스레드 => 동시 실행 )
 */
public class TestThread {
	public static void main(String[] args) {
		PreviewThread t=new PreviewThread();
		//t.test();
		t.start();//스레드를 실행 가능 상태로 만든다 
		System.out.println("메인 스레드 종료");
	}
}
class PreviewThread extends Thread{
	public void run() {
		test();
	}
	public void test() {
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
}











