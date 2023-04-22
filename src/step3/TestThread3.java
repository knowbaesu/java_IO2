package src.step3;
/*
 * step2 의 스레드 생성 방법 ( extends Thread ) 을  implements Runnable 방식으로
 * 변경해서 만들어 본다 
 * 
 * 사업이 번창하여 일꾼을 여러명 채용해서 일하게 한다 
 * => Worker 스레드를 여러개 생성해서 start 시켜 
 *     멀티스레딩하게 한다 
 * 
 *  전체 일꾼 4명 ( thread 4 )
 *  : main thread ( 사장 일꾼 )
 *    Worker Thread 1 - 심현준
 *    Worker Thread 2 - 박해준
 *    Worker Thread 3 - 최수연 
 */
public class TestThread3 {
	public static void main(String[] args) {
		Worker worker=new Worker();
		Thread thread=new Thread(worker,"심현준일꾼");
		thread.start();//현 스레드를 실행가능 상태로 보낸다
		Thread thread2=new Thread(worker,"박해준일꾼");
		thread2.start();//현 스레드를 실행가능 상태로 보낸다
		Thread thread3=new Thread(worker,"최수연일꾼");
		thread3.start();//현 스레드를 실행가능 상태로 보낸다
		System.out.println("main thread 종료");
	}
}







