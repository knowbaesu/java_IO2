package src.step5;

import step5.BackupWorker;

public class Word implements Runnable{
	@Override
	public void run() {
		try {
			BackupWorker backupWorker=new BackupWorker();
			Thread backupThread=new Thread(backupWorker);
			//자신을 실행한 스레드가 종료되면 함께 종료되도록 데몬 스레드로 설정한다 
			// 워드스레드의 작업이 종료되면 백업스레드의 작업도 함께 종료된다 
			backupThread.setDaemon(true);
			backupThread.start();
			word();
			backupWorker.backup();//최종적으로 백업 처리하기 위해 직접 backup() 을 호출한다 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void word() throws InterruptedException {
		for(int i=0;i<20;i++) {
			System.out.println("워드 문서 작업 "+i);
			Thread.sleep(1000);
		}
	}
}







