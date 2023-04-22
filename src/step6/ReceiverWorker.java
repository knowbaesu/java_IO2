package src.step6;

public class ReceiverWorker implements Runnable{
	@Override
	public void run() {
		try {
			receiveMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void receiveMessage() throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
			System.out.println("**서버로부터 친구들의 메세지를 수신한다**");
		}
	}
}



