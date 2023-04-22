package src.step4;

public class AudioWorker implements Runnable{
	@Override
	public void run() {
		try {
			audio();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void audio() throws InterruptedException {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" 오디오 일꾼 스레드가 음향서비스하다"+i);
			Thread.sleep(1000);
		}			
	}
}






