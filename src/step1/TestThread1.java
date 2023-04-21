package step1;
/*
 *  현 프로그램은 main thread ( 일꾼 ) 하나가
 *  동작된다. 그러므로 반드시 8시간 일하고 
 *  main thread 가 종료되는 구조다 
 */
public class TestThread1 {
	public static void main(String[] args) {
		Worker worker=new Worker();
		worker.work();
		System.out.println("main thread 종료");
	}
}
