package step5;

public class BackupWorker implements Runnable{
    @Override
    public void run() {
        try {
            backupExecute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void backupExecute() throws InterruptedException {
        while(true) {
            Thread.sleep(3000);
            backup();
        }
    }
    public void backup() {
        System.out.println("**백업스레드가 문서를 백업한다**");
    }
}

