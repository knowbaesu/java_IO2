package step4;

public class VideoWorker implements Runnable{
	@Override
	public void run() {
		try {
			video();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void video() throws InterruptedException {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" 비디오 일꾼 스레드가 영상서비스하다"+i);
			Thread.sleep(1000);
		}			
	}
}






