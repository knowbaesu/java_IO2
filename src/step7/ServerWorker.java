package step7;
/*
 *  실제 클라이언트를 담당하는 직원 클래스 
 */
public class ServerWorker implements Runnable{
	@Override
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void chatting() throws InterruptedException {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.println("**"+name+" ServerWorker 직원 스레드가 "+name+" 클라이언트에게 채팅서비스를 하다**");
		}
	}
}




