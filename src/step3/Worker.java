package src.step3;
/*
 *  implements Runnable 로 스레드 생성하는 것을 더 추천
 *  이유는 자바는 단일 상속이기 때문이다 
 */
public class Worker implements Runnable{
	@Override
	public void run() {// jvm 이 실행 
		try {
			work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void work() throws InterruptedException {
		//현재 실행중인 스레드의 이름을 받아온다 
		String threadName=Thread.currentThread().getName();
		for(int i=1;i<9;i++) {
			Thread.sleep(1000);
			System.out.println(threadName+" "+i+"시간 일하다");
		}
	}
}




