package step6;

public class SenderWorker implements Runnable{
    @Override
    public void run() {
        try {
            sendMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void sendMessage() throws InterruptedException {
        for(int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("**나의 메세지를 출력해서 서버로 전송한다**");
        }
    }
}