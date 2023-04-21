package step2;

public class WorkerThread extends Thread{
	@Override
	public void run() { // JVM 이 호출해 실행시킨다 
		work(); // 현 스레드(일꾼) 의 실행 내용 
	}
	public void work() {
		for(int i=1;i<9;i++) {
			System.out.println(i+"시간 일하다");
		}
	}
}
